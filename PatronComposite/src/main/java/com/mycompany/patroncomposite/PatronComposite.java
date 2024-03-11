/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.patroncomposite;

/**
 *
 * @@Marlon
 */
public class PatronComposite {

    public static void main(String[] args) {
     // Creamos los miembros de la familia
        MiembroDelaFamiliaConHijos padre = new   MiembroDelaFamiliaConHijos("Padre");
        MiembroDelaFamiliaConHijos madre = new  MiembroDelaFamiliaConHijos("Madre");
        MiembroDelaFamiliaConHijos hijo1 = new   MiembroDelaFamiliaConHijos("Hijo 1");
        MiembroDelaFamiliaConHijos hijo2 = new   MiembroDelaFamiliaConHijos("Hijo 2");
        MiembroDeLaFamiliaSinHijos nieto1 = new MiembroDeLaFamiliaSinHijos("Nieto 1");
        MiembroDeLaFamiliaSinHijos nieto2 = new MiembroDeLaFamiliaSinHijos("Nieto 2");  
        
         // Construir la estructura del árbol genealógico
        padre.AgregarHijo(hijo1);
        padre.AgregarHijo(hijo2);
        hijo1.AgregarHijo(nieto1);
        hijo2.AgregarHijo(nieto2);
        madre.AgregarHijo(hijo1);
        madre.AgregarHijo(hijo2);
        
        //Aqui se muesta el arbol genealogico familiar 
        padre.mostarRelaciones();
        
        
        
        
    }
}
