package Polymorphism;

public abstract class Animal {
    protected float peso;
    protected int idade;
    protected int numMembros;

    public Animal(float peso, int idade, int numMembros) {
        this.peso = peso;
        this.idade = idade;
        this.numMembros = numMembros;
    }

    //region Getter & Setter
    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getNumMembros() {
        return numMembros;
    }

    public void setNumMembros(int numMembros) {
        this.numMembros = numMembros;
    }
    //endregion

    abstract void locomover();
    abstract void alimentar();
    abstract void emitirSom();

}
