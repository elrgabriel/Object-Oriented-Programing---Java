package Polymorphism;

//Aula12 - Polimorfismo de sobreposição e sobrecarga
public class Main {
    public static void main(String[] args) {
//        Mamifero m = new Mamifero(85.5f,7,4,"preto");
//        Canguru c = new Canguru(56.5f,5,4,"castanho");
//
//        System.out.println(m.getClass());
//        m.locomover();
//        System.out.println(c.getClass());
//        c.locomover();
        Cachorro c = new Cachorro(7.5f,4,4,"preto");

        c.reagir("ola");
        c.reagir("vai apanhar");
        c.reagir(false);
        c.reagir(c.getIdade(),c.getPeso());
    }
}