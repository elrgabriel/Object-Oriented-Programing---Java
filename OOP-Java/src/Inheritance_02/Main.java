package Inheritance_02;

public class Main {
    public static void main(String[] args) {
    Aluno aluno = new Aluno("Jose",25,"masculino",2024001,"Dispositivos Moveis");
    System.out.println(aluno.getNome());
    aluno.pagarMensalidade();

    Bolsista bolsista = new Bolsista("Andre",18,"masculino",2024002,"Dispositivos Moveis",500);
        System.out.println(bolsista.getNome());
        bolsista.pagarMensalidade();

    Visitante visitante = new Visitante("Joana",23,"feminino");
        System.out.println(visitante.getNome());

    }
}