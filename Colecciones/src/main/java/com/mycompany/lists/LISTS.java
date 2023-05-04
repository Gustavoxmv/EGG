/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lists;

import com.mycompany.lists.entidades._1Perros;
import com.mycompany.lists.services.ServicioAlumno;
import com.mycompany.lists.services.ServicioPerros;

/**
 *
 * @author Gustavo
 */
public class LISTS {

    public static void main(String[] args) {
     
       ServicioAlumno service= new ServicioAlumno();
      
       service.agregarNota();
       service.MostrarAlumnos();
      service.NotaFinal();
      
      
    }
}
