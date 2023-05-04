/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lists.services;

import com.mycompany.lists.entidades._1Perros;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class ServicioPerros {
    List<String> Raza ;
    Scanner leer = new Scanner(System.in);  

    public ServicioPerros() {
        this.Raza=new ArrayList();
    }
    
    
    
public void Raza(){


String cont;
    do {
        
        System.out.println("Ingrese la Raza de Perro");
        String raza= leer.next();
        
        Raza.add(raza);
        
        System.out.println("Desea continuar?");
        cont=leer.next();
        
        
    } while (cont.equalsIgnoreCase("si"));

    
    

}    
    
public void Borrar(_1Perros perros){
    
    System.out.println("Ingresa una Mascota a Eliminar");
    String Perros = leer.next();
   
    
   
    Iterator it = Raza.iterator();

while(it.hasNext()){


     if(it.next().equals(Perros)){
     
     it.remove();        
    
     }  
    
    }
    
    for (String aux: Raza) {
        System.out.println(aux);
    }
    
  }

}
