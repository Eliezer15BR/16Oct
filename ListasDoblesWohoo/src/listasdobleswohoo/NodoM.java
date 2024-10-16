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
public class NodoM {
    private int nro;
    private String nombre;
    private int km2;
    private int nrohabkm2;
    private NodoM ant,sig;
    public NodoM() {
        ant=sig=null;
    }

    public NodoM getAnt() {
        return ant;
    }

    public void setAnt(NodoM ant) {
        this.ant = ant;
    }

    public NodoM getSig() {
        return sig;
    }

    public void setSig(NodoM sig) {
        this.sig = sig;
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

    public int getKm2() {
        return km2;
    }

    public void setKm2(int km2) {
        this.km2 = km2;
    }

    public int getNrohabkm2() {
        return nrohabkm2;
    }

    public void setNrohabkm2(int nrohabkm2) {
        this.nrohabkm2 = nrohabkm2;
    }
   
}
