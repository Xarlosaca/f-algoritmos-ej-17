/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias;
/**
 *
 * @author Salas
 */
public class Asignatura {

    private String nombre;
    private String tipo;
    private int costo;
    protected int numero_horas;

    public Asignatura(String n, String t,int cs, int nh) {
        setNombre(n);
        setTipo(t);
        setHoras(nh);  
        setCosto(cs);
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

    public void setHoras(int nh) {
        numero_horas=nh;
    }   
    public int getHoras(){
        return numero_horas;
    }
    public void setCosto( int cs){
        costo=cs;
    }
    public int getCosto(){
        return costo;
    }
    @Override
    public String toString() {
        return String.format("Nombre: %s - Tipo %s - Horas %d - Valor %d ",
                getNombre(), getTipo(), getHoras(), getCosto());
    }
}
