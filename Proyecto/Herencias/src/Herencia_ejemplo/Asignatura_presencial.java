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
public class Asignatura_presencial extends Asignatura{
    private int numero_horas;
    
    public Asignatura_presencial(String n, String t, int v, int nh) {
        super (n, t, v);
        setHoras(nh);
    }
    public void setHoras(int nh){
        numero_horas=nh;
    }
    public int getHoras (){
        return numero_horas;
    }
     @Override
    public String toString(){
    
        return String.format("%s - %d", super.toString(), getHoras());
    }
}
