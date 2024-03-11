/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patroncomposite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @@Marlon
 */
public class MiembroDelaFamiliaConHijos implements Persona {
private  String nombre;
private List<Persona> Hijos;

    public MiembroDelaFamiliaConHijos(String nombre) {
        this.nombre = nombre;
        this.Hijos = new ArrayList<>();
        
    }

   
    public void AgregarHijo(Persona persona) {
       Hijos.add(persona);
    }




    @Override
    public void mostarRelaciones() {
      System.out.println("Padre/Madre: " + nombre);   
      for (Persona Hijo : Hijos) {
         System.out.print("  ");
         Hijo.mostarRelaciones();
      }
    }
    
}
