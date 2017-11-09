/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia_ejemplo;

/**
 *
 * @author Salas
 */
public class Principal {
    public static void main(String[] args) {
    Asignatura_presencial ap = new Asignatura_presencial("Programacion", "Comun", 100, 180);
    
        System.out.println(ap);
    Asignatura_distancia ad = new Asignatura_distancia("Literatura", "Troncal", 300, 60);
        System.out.println(ad);
    }
}
