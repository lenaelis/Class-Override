public class Mamalia extends Binatang {
    @Override
    public void begerak(){
        System.out.println("Mamalia bergerak sebagian besar dengan kakinya");
    }    
    public void berlari(){
        System.out.println("Sebagian Mamalia dapat berlari");
    }
    public static void main(String[] args) {
        Binatang b = new Binatang();
        Mamalia m = new Mamalia();
        Binatang bm = new Mamalia();
     
        b.begerak();
        m.begerak();
        bm.begerak();
        bm.berkembangBiak();
    }
}
