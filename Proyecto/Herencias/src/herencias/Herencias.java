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
public class Herencias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Asignatura a1= new Asignatura("Programacion", "Comun", 100, 180);        
        Asignatura a2= new Asignatura("Literatura", "Troncal", 300, 200);
        
        System.out.println();
        
       /** Profesor p2 = new Profesor("René", "Elizalde", 20, 100.2);
        System.out.println(p2);*/
        
        //Estudiante e = new Estudiante( "Carlos", "Saca", 17);
        //System.out.println(e);
    }
    
}
