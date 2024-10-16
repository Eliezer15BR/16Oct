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
public class NodoZ {
    private Zona z;
    private NodoZ ant,sig;
    NodoZ(){
        ant=sig=null;
    }

    public Zona getZ() {
        return z;
    }

    public void setZ(Zona z) {
        this.z = z;
    }

    public NodoZ getAnt() {
        return ant;
    }

    public void setAnt(NodoZ ant) {
        this.ant = ant;
    }

    public NodoZ getSig() {
        return sig;
    }

    public void setSig(NodoZ sig) {
        this.sig = sig;
    }
    
}
