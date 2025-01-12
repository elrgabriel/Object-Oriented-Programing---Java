package Relationships_between_Classes;

import java.util.Objects;
import java.util.Random;

public class Luta {
    private Lutador desafiante, desafiado; // Tipo abstrato de dado - Agregação com a classe Lutador
    private int rounds;
    private boolean aprovada;

    //region Constructor, Getters and Setters
    public Luta() {
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    //endregion

    public void marcarLuta(Lutador l1, Lutador l2){
        if (Objects.equals(l1.getCategoria(), l2.getCategoria()) && l1 != l2) {
            this.setAprovada(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);
        } else{
            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
        }
    }

    public void lutar(){
        Random aleatorio = new Random();
        if (aprovada) {
            System.out.println("\n###DESAFIADO###\n");
            this.getDesafiado().anunciarLutador();
            System.out.println("\n###DESAFIANTE###\n");
            this.getDesafiante().anunciarLutador();
            int vencedor = aleatorio.nextInt(3);
            switch (vencedor) {
                case 0://Empate
                    System.out.println("\nEmpate!\n");
                    this.getDesafiado().empatarLuta();
                    this.getDesafiante().empatarLuta();
                    break;
                case 1://Ganhou Desafiante
                    System.out.println("\nVitória de "+ desafiante.getNome() + "!\n");
                    this.getDesafiante().ganharLuta();
                    this.getDesafiado().perderLuta();
                    break;
                case 2://Ganhou Desafiado
                    System.out.println("\nVitória de "+ desafiado.getNome() + "!\n");
                    this.getDesafiado().ganharLuta();
                    this.getDesafiante().perderLuta();
                    break;
            }
        } else{
            System.out.println("Luta não pode acontecer");
        }
    }
}
