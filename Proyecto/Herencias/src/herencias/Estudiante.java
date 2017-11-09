/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias;

/**
 *
 * @author reroes
 */
public class Estudiante extends Persona {

    //private double matricula;
    //crear arre atributo Asignaturas  que es un arreglo de asignaturas presencial, y un metodo obtener valor matricula+
    private Asignatura[] asignaturas;

    public Estudiante(String n, String a, int e, Asignatura[] asig) {
        super(n, a, e);
        setAsignaturas(asig);
    }

    public void setAsignaturas(Asignatura [] asig) {
        asignaturas = asig;
    }

    public Asignatura [] getAsignaturas () {
        return asignaturas;
    }
    
    public double getMatricula(){
        double valor_m=0;
        Asignatura[] cMatricula= getAsignaturas();
        for(int i=0;i<cMatricula.length; i++){
          //  valor_m=cMatricula.getAsignaturas();
        }
        return valor_m;
    }
    @Override
    public void setEdad(int e) {
        if (e < 18) {
            edad = 18;
        } else {
            edad = e;
        }
    }

    @Override
    public String toString() {

        return String.format("%s - %f", super.toString(), getMatricula());
    }

    // @Override
    // public String toString(){
    //    return String.format("%s - %f", getApellido(), getMatricula());
    // }
}
