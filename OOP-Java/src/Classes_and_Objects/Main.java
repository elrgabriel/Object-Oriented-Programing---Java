package Classes_and_Objects;

//Class 01 - Classes and Objects
public class Main {


    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tampar();
        c1.status();
        c1.rabiscar();

        Caneta c2 = new Caneta();
        c1.modelo = "Hostnet";
        c1.cor = "preta";
        c2.destampar();
        c2.status();
        c2.rabiscar();

    }
}