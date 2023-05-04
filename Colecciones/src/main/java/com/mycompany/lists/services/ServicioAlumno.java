/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lists.services;


import com.mycompany.lists.entidades._2Alumno;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class ServicioAlumno {
    List<_2Alumno>Alumno = new ArrayList();
    
    Scanner leer = new Scanner(System.in);  
    
 
   
    
   
    
    public void agregarNota() {
              
    
        
        String resp;
        do {
            List<Integer> notas= new ArrayList();
            System.out.println("Nombre del alumno");
            String nombre=leer.next();
            
            System.out.println("Notas del alumno");
            notas.add(leer.nextInt());
            notas.add(leer.nextInt());
            notas.add(leer.nextInt());
            
            
            Alumno.add(new _2Alumno(nombre,notas));
            
            System.out.println("Desea Continuar?");
            resp= leer.next();
            
        } while (resp.equalsIgnoreCase("Si"));
    }
    
    
    public void MostrarAlumnos(){
        for (_2Alumno aux : Alumno) {
            System.out.println(aux.toString());
            
        }
    
    }
   
    
    
        
        public void NotaFinal(){
        
            System.out.println("Ingrese Nombre del Alumno que quiere saber su nota final");
            String alumno= leer.next();
            boolean encontrado=false;
            
            for (_2Alumno aux : Alumno) {
               
                if(aux.getNombre().equalsIgnoreCase(alumno)){
                     List<Integer> notas = aux.getNotas();
                    double promedio= (notas.get(0) + notas.get(1) + notas.get(2)) / 3.0;

                    System.out.println("La nota final final es :"+promedio);
                
                }
                else System.out.println("El alumno no se encuentra en la lista");
            }
            
            
        
        
        }
        
       
}
