package Polymorphism;

public class Canguru extends Mamifero{

    public Canguru(float peso, int idade, int numMembros, String corPelo) {
        super(peso, idade, numMembros, corPelo);
    }

    public void usarBolsa(){
        System.out.println("Usando a Bolsa");
    }
    public void locomover(){
        System.out.println("Saltando");
    }
}
