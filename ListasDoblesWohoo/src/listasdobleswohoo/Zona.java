/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasdobleswohoo;

/**
 *
 * @author estudiante
 */
public class Zona {
    private int nro;
    private String nombre;

    public Zona() {
    }
    
    public Zona(int nro, String nombre) {
        this.nro = nro;
        this.nombre = nombre;
    }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void mostrar(){
        System.out.println(" ["+nro+" "+nombre+"]");
    }
}
