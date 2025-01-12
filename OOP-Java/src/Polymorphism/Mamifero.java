package Polymorphism;

public class Mamifero extends Animal {
    private String corPelo;

    public Mamifero(float peso, int idade, int numMembros, String corPelo) {
        super(peso, idade, numMembros);
        this.corPelo = corPelo;
    }

    //region Getter & Setter
    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    //endregion

    @Override
    void locomover() {
        System.out.println("Correndo");
    }

    @Override
    void alimentar() {
        System.out.println("Mamando");
    }

    @Override
    void emitirSom() {
        System.out.println("som de mamífero");
    }


}
