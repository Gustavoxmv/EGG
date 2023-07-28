/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria.servicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import libreria.entidades.Autor;
import libreria.entidades.Editorial;
import libreria.persistence.AutorJpaController;
import libreria.persistence.EditorialJpaController;
import libreria.persistence.exceptions.NonexistentEntityException;

/**
 *
 * @author Gustavo
 */
public class ServicioEditorial {
     Scanner leer = new Scanner(System.in);  
    
   EditorialJpaController editorialJpa = new EditorialJpaController();
   
   Editorial editorial = new Editorial();

   public Editorial crearEditorial() throws Exception {
     try {
            System.out.println("Ingrese el nombre del Editorial");
           editorial.setNombre(leer.next());
           System.out.println("Dar de alta");
          editorial.setAlta(leer.nextBoolean());
          editorialJpa.create(editorial);
          
          return editorial;
       } catch (Exception e) {
            throw e;

       }
   }
   
   
   
   public void mostrarEditoriales() {
        List<Editorial> editoriales = new ArrayList();
        
        editoriales = editorialJpa.findEditorialEntities();
        
        for (Editorial aux : editoriales) {
            if (aux.isAlta()) {
                System.out.println(aux.toString());
            }
        }
    }
   
   
   public void editarEditorial() throws Exception{
 
  System.out.println("Seleccionar Editorial");
     mostrarEditoriales();
     
     long idA= leer.nextLong();
     
    Editorial editorial= editorialJpa.getEntityManager().find(Editorial.class, idA);
     
     editorial.setNombre(leer.next());
     
     editorialJpa.edit(editorial);
 
 }
   
   public void eliminarEditorial() throws NonexistentEntityException{
   System.out.println("Seleccionar Editorial");
     mostrarEditoriales();
     
     editorialJpa.destroy(leer.nextLong());
   
   }
   
}
