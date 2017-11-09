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
public class Asignatura_distancia extends Asignatura{

    private int numero_creditos;

    public Asignatura_distancia(String n, String t, int v, int nc) {
        super(n, t, v);
        setCreditos(nc);
    }

    public void setCreditos(int nc) {
        numero_creditos = nc;
    }

    public int getCreditos() {
        return numero_creditos;
    }
     public String toString(){
    
        return String.format("%s - %d", super.toString(), getCreditos());
    }
}
