package listasdobleswohoo;
/**
 *
 * @author estudiante
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LDobleM A=new LDobleM();
        A.adiprincipio(1, "Centro", 25, 10000);
        A.adiprincipio(2, "Cotahuma", 50, 18000);
        A.adiprincipio(3, "Periferica", 73, 9000);
        A.adiprincipio(4, "Sur", 65, 13500);
        A.adiprincipio(5, "San Antonio", 35, 1500);
        A.adiprincipio(6, "Max Paredes", 43, 3500);
        A.adiprincipio(7, "Mallasa", 160, 1100);
        A.adiprincipio(8, "Hampaturi", 145, 5500);
        A.adiprincipio(9, "Zongo", 260, 8700);
        System.out.println("LISTA DE MACRODISTITOS");
        A.mostrar();
        LDobleZ B=new LDobleZ();
        B.adifinal(new Zona(1,"Miraflores"));
        B.adifinal(new Zona(1,"San Jorge"));
        B.adifinal(new Zona(2,"San Pedro"));
        B.adifinal(new Zona(2,"Sopocachi"));
        B.adifinal(new Zona(2,"Tembladarani"));
        B.adifinal(new Zona(6,"Munaypata"));
        B.adifinal(new Zona(6,"El Tejar"));
        System.out.println("LISTA DE ZONAS");
        B.mostrar();
        //3. Mostrar la superficie del Macrodistrito X
        System.out.println("---------");
        ej3(A,"Sur");
        System.out.println("-----------");
        //4 mostrar cada Macrodistritos y sus zonas
        ejer4(A,B);
        System.out.println("---------");
        //5.mostrar las zonas del macrodistrito con nombre x
       ej5(A,B,"Cotahuma");
    }
    public static void ej3(LDobleM A,String x){
        NodoM b=A.getP();
        while(b!=null){
            if(b.getNombre().equals(x)){
                System.out.println(b.getKm2());
            }
            b=b.getSig();
        }
    }
    public static void ejer4(LDobleM a, LDobleZ b){
        NodoM aa=a.getP();
        while(aa!=null){
            System.out.println("MACRODISTRITO: "+aa.getNombre());
            NodoZ bb=b.getP();
            while(bb!=null){
                if(bb.getZ().getNro()==aa.getNro()){
                    System.out.println("   "+bb.getZ().getNombre());
                }
                bb=bb.getSig();
            }
            aa=aa.getSig();
            
        }
    }
    public static void ej5(LDobleM A,LDobleZ B,String x){
        NodoM aa=A.getP();
        while(aa!=null){
            if(aa.getNombre().equals(x)){
                NodoZ cc=B.getP();
                while(cc!=null){
                    if(cc.getZ().getNro()==aa.getNro()){
                        cc.getZ().mostrar();
                    }
                    cc=cc.getSig();
                }
            }
            aa=aa.getSig();
        }
    }
    
}
