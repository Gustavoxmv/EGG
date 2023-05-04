/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lists.entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gustavo
 */
public class _2Alumno {
  
    private String nombre;
    private List<Integer> notas;

        public _2Alumno(String nombre, List<Integer> notas) {
            this.nombre = nombre;
            this.notas = notas;
        }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Integer> getNotas() {
        return notas;
    }

    public void setNotas(List<Integer> notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "_2Alumno{" + "nombre=" + nombre + ", notas=" + notas + '}';
    }

    
    
}
