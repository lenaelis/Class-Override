public class Serangga extends Binatang {
    @Override
    public void begerak(){
        System.out.println("Serangga bergerak sebagian besar dengan kakinya");
    }    
    public void berlari(){
        System.out.println("Sebagian Serangga dapat terbang");
    }
    public static void main(String[] args) {
        Binatang b = new Binatang();
        Serangga s = new Serangga();
        Binatang bs = new Serangga();
     
        b.begerak();
        s.begerak();
        bs.begerak();
        bs.berkembangBiak();
    }
}