/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patroncomposite;

/**
 *
 * @Marlon
 */
public class MiembroDeLaFamiliaSinHijos implements Persona {
    private  String nombre;

    public MiembroDeLaFamiliaSinHijos(String nombre) {
        this.nombre = nombre;
        
    }

    @Override
    public void mostarRelaciones() {
        System.out.println("Hijo/Hija: " + nombre);
    }
     
}
