/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacionaula;

/**
 *
 * @author jacortes
 */
public class Delegado extends Alumno {

    public Delegado(String nom, int cur, int na) {
        super(nom, cur, na);
    }

    public void esDelegado() {
        System.out.println(nombre + " es delegado del curso " + curso);
    }

}
