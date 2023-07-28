
package libreria;

import java.util.Scanner;
import libreria.entidades.Autor;
import libreria.persistence.ControladoraPersistencia;
import libreria.servicio.MenuLibreria;
import libreria.servicio.ServicioAutor;
import libreria.servicio.ServicioLibro;

/**
 *
 * @author Gustavo
 */
public class JPA_ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
    
        
        Scanner leer = new Scanner(System.in);
      ServicioLibro libros= new ServicioLibro();
      
    
      
         int a;
        do {
            System.out.println("--------------------------------");
              System.out.println("1.Agregar");
        System.out.println("2.Mostrar");
        System.out.println("3.Eliminar");
        System.out.println("4.Editar");
            System.out.println("5.Buscar Libro");
            System.out.println("6.Buscar Libro ISBN");
            System.out.println("7.Buscar Libro Autor");
       
            System.out.println("---------------------------------");
        
      a=leer.nextInt();
            switch (a) {
                case 1:
                    libros.CrearLibro();
                    break;
                case 2:
                    libros.MostrarLibros();
                    break;
                case 3:
                    libros.EliminarLibro();
                    break;
                    
                case 4:
                    libros.BuscarLibroTitulo();
                    break;
                    
                case 5:
                    libros.BuscarLibroTitulo();
                    break;
               
                case 6:
                    libros.BuscarLibroISBN();
                    break;
                
                case 7:
                    libros.BuscarLibroAutor();
                    break;
           
                   
                    
                default:
                    throw new AssertionError();
            }
            
            
            
        } while (true);
      
      
    }
    
}
