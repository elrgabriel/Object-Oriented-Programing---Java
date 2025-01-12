package Polymorphism;

public class Cachorro extends Lobo {
    public Cachorro(float peso, int idade, int numMembros, String corPelo) {
        super(peso, idade, numMembros, corPelo);
    }

    public void enterrarOsso(){
        System.out.println("Enterrando osso");
    }
    public void abanarRabo(){
        System.out.println("Abanando rabo");
    }

    //region Polimorfismo de Sobrecarga
    public void reagir(String frase){
        if (frase.equals("ola")) {
            System.out.println("Abanando rabo");
        }else{
            System.out.println("Rosnando");
        }
    }

    public void reagir(int hora){
        if (hora < 12) {
            System.out.println("Abanando rabo");
        } else if (hora >= 18) {
            System.out.println("Ignorar");
        } else {
            System.out.println("Abanar e latir");
        }
    }
    public void reagir(Boolean dono){
        if (dono) {
            System.out.println("Abanando rabo");
        } else {
            System.out.println("Rosnar e latir");
        }
    }
    public void reagir(int idade, float peso){
        if (idade < 5) {
            if (peso < 10) {
                System.out.println("Abanando rabo");
            } else {
                System.out.println("Latindo");
            }
        } else {
            if (peso < 10) {
                System.out.println("Rosnando");
            } else {
                System.out.println("Ignorando");
            }
        }
    }
    //endregion
}
