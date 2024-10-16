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
public class LDobleM {
    private NodoM p;

    public NodoM getP() {
        return p;
    }

    public void setP(NodoM p) {
        this.p = p;
    }
    public void adiprincipio(int a,String b,int c,int d){
        NodoM nue=new NodoM();
        nue.setNro(a);
        nue.setNombre(b);
        nue.setKm2(c);
        nue.setNrohabkm2(d);
        if(getP()==null){
            setP(nue);
        }
        else{
            nue.setSig(getP());
            getP().setAnt(nue);
            setP(nue);
        }
    }
    public void mostrar(){
        NodoM r=getP();
        while(r!=null){
            System.out.println(" <"+r.getNro()+" "+r.getNombre()+" "+r.getKm2()+" "+r.getNrohabkm2()+">");
            r=r.getSig();
        }
    }
}
