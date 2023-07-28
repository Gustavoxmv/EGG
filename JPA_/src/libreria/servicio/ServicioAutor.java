/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria.servicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import libreria.entidades.Autor;
import libreria.persistence.AutorJpaController;
import libreria.persistence.exceptions.NonexistentEntityException;

/**
 *
 * @author Gustavo
 */
public class ServicioAutor {
    Scanner leer = new Scanner(System.in);  
    
   AutorJpaController autorJpa = new AutorJpaController();
   
   Autor auto = new Autor();

   public Autor crearAutor() throws Exception {
     try {
       
         
         
            System.out.println("Ingrese el nombre del autor");
           auto.setNombre(leer.next());
           System.out.println("Dar de alta");
          auto.setAlta(leer.nextBoolean());
           autorJpa.create(auto);
           
           return auto;
       } catch (Exception e) {
            throw e;

       }
   }
   
 public void mostrarAutores() {
     
     Autor auto = new Autor();
     
        List<Autor> autor = new ArrayList();
        
        autor = autorJpa.findAutorEntities();
        
        for (Autor aux : autor) {
            if (aux.isAlta()) {
                System.out.println(aux.toString());
            }
        }
    }
 
    
 public void eliminarAutor() throws NonexistentEntityException{
     Autor auto = new Autor();
     System.out.println("Seleccionar Autor");
     mostrarAutores();
     autorJpa.destroy(leer.nextLong());
 
 }
    
 
 public void editarAutor() throws Exception{
     
     Autor auto = new Autor();
 
  System.out.println("Seleccionar Autor");
     mostrarAutores();
     
     long idA= leer.nextLong();
     
     Autor autor= autorJpa.getEntityManager().find(Autor.class, idA);
     
     autor.setNombre(leer.next());
     
     autorJpa.edit(autor);
 
 }
 
 
 
 
 
}
