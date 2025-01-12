package Polymorphism;

public class Reptil extends Animal {
    private String corEscama;

    public Reptil(float peso, int idade, int numMembros, String corEscama) {
        super(peso, idade, numMembros);
        this.corEscama = corEscama;
    }

    //region Getter & Setter
    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    //endregion

    @Override
    void locomover() {
        System.out.println("Rastejando");
    }

    @Override
    void alimentar() {
        System.out.println("Comendo vegetais");
    }

    @Override
    void emitirSom() {
        System.out.println("Som de réptil");
    }



}
