package Polymorphism;

public class Lobo extends Mamifero{
    public Lobo(float peso, int idade, int numMembros, String corPelo) {
        super(peso, idade, numMembros, corPelo);
    }

    public void emitirSom(){
        System.out.println("Auuuuuuuuuuuu");
    }

}
