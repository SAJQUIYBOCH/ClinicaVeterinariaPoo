/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clinicaveterinariapoo;

/**
 *
 * @author User
 */

public class Perro extends Mascota implements Vacunable {
    @Override
    public void hacerSonido() {
        System.out.println("El perro hace: ¡Guau guau!");
    }
    
    @Override
    public void vacunar() {
        System.out.println("Vacunando al perro contra la rabia.");
    }
}