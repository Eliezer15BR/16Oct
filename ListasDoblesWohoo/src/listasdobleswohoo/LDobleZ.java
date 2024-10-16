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
public class LDobleZ {
    private NodoZ p;

    public NodoZ getP() {
        return p;
    }

    public void setP(NodoZ p) {
        this.p = p;
    }
    public void adiprincipio(Zona Z){
        NodoZ nue=new NodoZ();
        nue.setZ(Z);
        if(getP()==null){
            setP(nue);
        }
        else{
            nue.setSig(getP());
            getP().setAnt(nue);
            setP(nue);
        }
    }
    public void adifinal(Zona a){
        NodoZ nue=new NodoZ();
        nue.setZ(a);
        if(getP()==null){
            setP(nue);
        }
        else{
            NodoZ w=getP();
            while(w.getSig()!=null){
                w=w.getSig();
            }
            w.setSig(nue);
            nue.setAnt(w);
        }
    }
    public void mostrar(){
        NodoZ r=getP();
        while(r!=null){
            r.getZ().mostrar();
            r=r.getSig();
        }
    }
}
