package Visibility;

public class Caneta { //Caneta = Pen
    // Default visibility - Public to package
    //Public - Current and all other classes have access to the components
    //Private - Only the current Class has access to the components
    //Protected - Only current class and its subclasses have access to the components

    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;

    public void status() {
        System.out.println("Modelo " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta " + this.ponta);
        System.out.println("Carga " + this.carga);
        System.out.println("Está tampada? " + this.tampada);
    }

   public void rabiscar() {
        if (this.tampada) {
            System.out.println("\nERRO! Não posso rabiscar\n");
        } else {
            System.out.println("\nEstou rabiscando\n");
        }
    }

   public void tampar() { //Cover the pen tip.
        this.tampada = true;
    }

   public void destampar() { //Uncover the pen tip.
        this.tampada = false;
    }
}
