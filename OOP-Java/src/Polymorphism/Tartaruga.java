package Polymorphism;

public class Tartaruga extends Reptil{
    public Tartaruga(float peso, int idade, int numMembros, String corEscama) {
        super(peso, idade, numMembros, corEscama);
    }

    public void locomover(){
        System.out.println("Andando bem devagar");
    }
}
