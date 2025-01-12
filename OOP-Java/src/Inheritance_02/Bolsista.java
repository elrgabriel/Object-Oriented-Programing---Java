package Inheritance_02;

public final class Bolsista extends Aluno{
    private int bolsa;

    public Bolsista(String nome, int idade, String sexo, int matricula, String curso, int bolsa) {
        super(nome, idade, sexo, matricula, curso);
        setBolsa(bolsa);
    }


    //region Getter & Setter
    public int getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }
    //endregion

    @Override
    public void pagarMensalidade() {
        System.out.println("Pagando mensalidade de bolsista");
    }
}
