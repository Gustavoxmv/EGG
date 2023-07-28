/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria.servicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import libreria.Exep.LibroExceptions;
import libreria.entidades.Autor;
import libreria.entidades.Editorial;
import libreria.entidades.Libro;
import libreria.persistence.AutorJpaController;
import libreria.persistence.EditorialJpaController;
import libreria.persistence.LibroJpaController;
import libreria.persistence.exceptions.NonexistentEntityException;

/**
 *
 * @author Gustavo
 */
public class ServicioLibro {
     Scanner leer = new Scanner(System.in);  
    
   LibroJpaController libroJpa = new LibroJpaController();
   
  Libro libro= new Libro();
  ServicioAutor autors= new ServicioAutor();
  ServicioEditorial editorials= new ServicioEditorial();
  
   public void CrearLibro() throws LibroExceptions{
       try {
           System.out.println(" Ingrese el titulo de libro");
           libro.setTitulo(leer.next());
          
           if(libro.getTitulo().isEmpty()){
          throw new LibroExceptions("No puede estar vacio");  
          }
           
           System.out.println(" Ingrese el Anio de libro");
           libro.setAnio(leer.nextInt());
           
           System.out.println(" Ingrese cantidad de ejemplares");
           libro.setEjemplares(leer.nextInt());
           
           
           System.out.println(" Ingrese cantidad de ejemplares prestados");
           libro.setEjemplaresPrestados(leer.nextInt());
           
           System.out.println("Ingrese el autor");
           Autor autor = autors.crearAutor();
          libro.setAutor(autor);
           
           
           System.out.println("Ingrese editorial");
           Editorial editorial= editorials.crearEditorial();
           
           libroJpa.create(libro);
           


           
           
       } 
      catch (LibroExceptions e) {
           throw e;
           
       }
   
       
       catch (Exception e) {
           
           
       }
   
   
   }

   public void MostrarLibros(){
 

  List<Libro> libros = new ArrayList();
        
        libros = libroJpa.findLibroEntities();
        
        for (Libro aux : libros) {
            
                System.out.println(aux.getId()+" "+aux.getTitulo()+" ------ Autor = "+aux.getAutor().getNombre());
            
        }
   
   }
   
   public void EliminarLibro() throws NonexistentEntityException{
   
       System.out.println(" Selecciona el libro");
       MostrarLibros();
       
       libroJpa.destroy(leer.nextLong());
   
   }
   
   public void EditarLibro(){
   
       System.out.println("Selecciona el libro");
       MostrarLibros();
       
        Long ida= leer.nextLong();
       Libro libro = libroJpa.getEntityManager().find(Libro.class, ida);
       
       System.out.println("Anio ");
       libro.setAnio(leer.nextInt());
       System.out.println("Autor");
       
   
   }
   
   public void BuscarLibroTitulo(){
   
       System.out.println("Titulo de libro ");
       String titulo = leer.next();
       
        List<Libro> libros = new ArrayList();
        libros = libroJpa.findLibroEntities();
       
        for (Libro aux : libros) {
           
           if(titulo.contains(aux.getTitulo())){
           
               System.out.println(aux.toString());
           } 
            
       }
    
   
   }
   public void BuscarLibroISBN(){
   
       System.out.println("ISBN del libro ");
       Long id = leer.nextLong();
       
        List<Libro> libros = new ArrayList();
        libros = libroJpa.findLibroEntities();
       
        for (Libro aux : libros) {
           
           if(aux.getId().equals(id)){
           
               System.out.println(aux.toString());
           } 
            
       }
    
   
   }
   public void BuscarLibroAutor(){
   
       System.out.println("Ingrese el Autor ");
      String autor= leer.next();
      
       
        List<Libro> libros = new ArrayList();
        libros = libroJpa.findLibroEntities();
       
        for (Libro aux : libros) {
           
           if(aux.getAutor().getNombre().equals(autor)){
           
               System.out.println(aux.toString());
           } 
            
       }
    
   
   }
   
}
