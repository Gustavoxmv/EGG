/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria.servicio;

import java.util.Scanner;
import libreria.entidades.Editorial;
import libreria.persistence.EditorialJpaController;

/**
 *
 * @author Gustavo
 */
public class MenuLibreria {
 
    Scanner leer = new Scanner(System.in);  
    
   EditorialJpaController editorialJpa = new EditorialJpaController();
   
   ServicioAutor autSer = new ServicioAutor();
   ServicioLibro libSer = new ServicioLibro();
   ServicioEditorial edSer= new ServicioEditorial();
   
   Editorial editorial = new Editorial();
   
  public void Menu() throws Exception{
      
      String op;
      int ope;
      do {  
            System.out.println("----Menu------");
            System.out.println("A- Dar de Alta");
            System.out.println("B- Dar de Baja");
         System.out.println("C- Editar ");
            System.out.println("D- Salir");
            
            op= leer.next();
  
            switch (op.toUpperCase()) {
                
                case "A":
                    System.out.println("Que desea dar de alta? \n1: Autor\n 2: Libro\n 3:Editorial");
                    ope=leer.nextInt();
                    
                    if (ope == 1) {
                        autSer.crearAutor();                    
                        
                    }else if(ope == 2) {
                        System.out.println("Titulo/Año/CantEjemp/CantEjPREST/nombAut");
                       libSer.CrearLibro();
                        
                    }else if(ope == 3) {
                        edSer.crearEditorial();
                        
                    }

                default:
                    System.out.println("Opción inválida");
            }
            
        } while (!(op.equalsIgnoreCase("D")));

    }
  
}
    

    
    
    

