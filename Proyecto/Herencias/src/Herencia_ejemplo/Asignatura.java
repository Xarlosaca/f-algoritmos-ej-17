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
public class Asignatura {

    private String nombre;
    private String tipo;
    protected int costo;

    public Asignatura(String n, String t, int v) {
        setNombre(n);
        setTipo(t);
        setValor(v);        
    }

    public void setNombre(String n) {
        nombre =n;
    }
    public String getNombre(){
        return nombre;
    }

    public void setTipo(String t) {
        tipo=t;
    }
    public String getTipo(){
        return tipo;
    }

    public void setValor(int v) {
        costo=v;
    }   
    public int getValor(){
        return costo;
    }
    @Override
    public String toString() {
        return String.format("Nombre: %s - Tipo %s - Valor %d",
                getNombre(), getTipo(), getValor());
    }
}
