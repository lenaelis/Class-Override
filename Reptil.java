public class Reptil extends Binatang {
    @Override
    public void begerak(){
        System.out.println("Reptil bergerak sebagian besar dengan kakinya");
    }    
    public void berlari(){
        System.out.println("Sebagian Reptil memiliki sisik");
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Binatang b = new Binatang();
        Reptil r = new Reptil();
        Binatang br = new Reptil();
     
        b.begerak();
        r.begerak();
        br.begerak();
        br.berkembangBiak();
    }
}