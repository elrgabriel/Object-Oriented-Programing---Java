package Classes_and_Objects;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void status(){
        System.out.println("Modelo " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta " + this.ponta);
        System.out.println("Carga " + this.carga);
        System.out.println("Está tampada? " + this.tampada);
    }

    void rabiscar(){
        if (this.tampada){
            System.out.println("\nERRO! Não posso rabiscar\n");
        }else {
            System.out.println("\nEstou rabiscando\n");
        }
    }

    void tampar(){ //Cover the pen tip.
        this.tampada = true;
    }

    void destampar(){ //Uncover the pen tip.
        this.tampada = false;
    }
}
