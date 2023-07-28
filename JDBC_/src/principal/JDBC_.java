/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package principal;

import Servicios.productoService;
import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class JDBC_ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
    productoService service= new productoService();  
           
           //crear
           // service.crearProducto("Wii", 500, 2);
           //modificar
           //service.modificarProducto(2,"b" );
           //eliminar
           //service.borrarProducto("a");
           //leer
           // service.imprimirProductos120();
           
           int eleccion;
           Scanner leer = new Scanner(System.in);   
        do {            
            
            System.out.println("------------------------------MENU---------------------------------");
            System.out.println("1.-Mostrar todos los productos");
            System.out.println("2.-Mostrar todos los productos y precios");
            System.out.println("3.-Mostrar todos los productos y precios entre 120 y 202");
            System.out.println("0.-Salir");
            
            
            
            eleccion=leer.nextInt();
            switch (eleccion) {
                
                case 1:
                    service.imprimirProductos();
                    break;
                    
                case 2:
                    service.imprimirProductosprecios();
                    break;
                    
                case 3:
                    service.imprimirProductos120();
                    break;
                    
                    
                case 0:
                    System.out.println("Saliendo...");
                    break;
                    
                default:
                   throw new Exception("Opcion incorrecta");
            }
            
            
        } while (eleccion!=0);
            
            
       
    
    }
    
}
