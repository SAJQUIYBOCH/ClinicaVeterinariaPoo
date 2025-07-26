/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clinicaveterinariapoo;

import java.util.ArrayList;
import java.util.List;

public class ConsultaVeterinaria {
    public static void main(String[] args) {
        List<Mascota> mascotas = new ArrayList<>();
        
        mascotas.add(new Perro());
        mascotas.add(new Gato());
        mascotas.add(new Conejo());
        mascotas.add(new Tortuga());
        
        for (Mascota mascota : mascotas) {
            mascota.hacerSonido();
            mascota.descansar();
            
            if (mascota instanceof AtencionEspecial ae) {
                ae.recibirAtencionEspecial();
                //((AtencionEspecial) mascota).recibirAtencionEspecial();
            }
            
            if (mascota instanceof Vacunable v) {
                 v.vacunar();
                //((Vacunable) mascota).vacunar();
            }
            
            System.out.println();
        }
    }
}