package Getter_Setter_Constructor_Methods;

//Getter, Setter and Constructor methods
public class Main {
    public static void main(String[] args) {
       /* Caneta c1 = new Caneta();*/
//        c1.setModelo("BIC");
//        c1.modelo = "BIC"; doesn't work because the attribute is set as private.
//        c1.setPonta(0.5f);
//        c1.ponta = 0.5f; doesn't work because the attribute is set as private.
//        System.out.println("Tenho uma caneta " + c1.getModelo() + " de ponta "+c1.getPonta());
        Caneta c2 = new Caneta("Vermelho","BIC Cristal",0.7f);
        c2.status();
        c2.setPonta(1.2f);
    }
}
