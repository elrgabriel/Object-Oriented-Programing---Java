package Polymorphism;

public class Peixe extends Animal {
    private String corEscama;

    public Peixe(float peso, int idade, int numMembros, String corEscama) {
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

    public void soltarBolha(){
        System.out.println("Soltando bolha");
    }

    @Override
    void locomover() {
        System.out.println("Nadando");
    }

    @Override
    void alimentar() {
        System.out.println("Comendo plâncton");
    }

    @Override
    void emitirSom() {
        System.out.println("Piexe não faz som");
    }
}
