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
public class Profesor extends Persona {

    private double sueldo;

    public Profesor(String n, String a, int e, double suel) {
        super(n, a, e);
        setSueldo(suel);
    }

    private void setSueldo(double suel) {
        sueldo = suel;
    }

    private double getSueldo() {

        return sueldo;
    }
    @Override
    public void setEdad(int e){
         if(e<30){
            edad =30;
        }else{
            edad=e;
        }
    }
    @Override
    public String toString(){
    
        return String.format("%s - %f", super.toString(), getSueldo());
    }
}
