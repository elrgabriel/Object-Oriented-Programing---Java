package Polymorphism;

public class Ave extends Animal {
    private String corPena;

    public Ave(float peso, int idade, int numMembros, String corPena) {
        super(peso, idade, numMembros);
        this.corPena = corPena;
    }

    //region Getter & Setter
    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
    //endregion

    public void fazerNinho(){
        System.out.println("Construindo ninho");
    }

    @Override
    void locomover() {
        System.out.println("Voando");
    }

    @Override
    void alimentar() {
        System.out.println("Comendo frutas");
    }

    @Override
    void emitirSom() {
        System.out.println("Som de ave");
    }
}
