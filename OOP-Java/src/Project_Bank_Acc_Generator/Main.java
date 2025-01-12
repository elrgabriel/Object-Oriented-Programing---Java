package Project_Bank_Acc_Generator;

//Bank Account Generator
public class Main {
    public static void main(String[] args) {

//    ContaBanco c1 = new ContaBanco();
//    c1.setNome("Jubileu");
//    c1.abrirConta();
//    c1.status();
//    c1.pagarMensalidade();
//    c1.status();
//    c1.depositar(300.00f);
//    c1.status();

        ContaBanco c2 = new ContaBanco();
        c2.setNome("Creuza");
        c2.abrirConta();
        c2.status();
        c2.pagarMensalidade();
        c2.status();
        c2.depositar(500.00f);
        c2.status();
        c2.sacar(538.00f);
        c2.fecharConta();
        c2.status();
    }
}