package Project_Bank_Acc_Generator;

import java.util.Objects;
import java.util.Scanner;

public class ContaBanco {
    public static int numConta; //Account number
    protected String tipoConta; //Account type [CC or CP]
    private String nome; //Account holder's name
    private float saldo; //Account balance
    private boolean statusConta, statMensalidade; //Account current status |Account monthly maintenance payment

    Scanner scan = new Scanner(System.in);

    //region Constructor, Getters, Setters and Status

    public ContaBanco() {
        this.statusConta = false;
        this.saldo = 0;
        numConta++;
    } //Constructor method with counter used to generate account number.

    public int getNumConta() { //Acc number getter method
        return numConta;
    }

    public String getTipoConta() { //Acc type getter method
        return tipoConta;
    }

    public void setTipoConta(String ptipoConta) { //Acc type getter method
        this.tipoConta = ptipoConta;
    }

    public String getNome() { //Acc holder name getter method
        return this.nome;
    }

    public void setNome(String pnome) { //Acc holder name setter method
        this.nome = pnome;
    }

    public float getSaldo() { //Acc balance getter method
        return this.saldo;
    }

    public void setSaldo(float psaldo) { //Acc balance setter method
        this.saldo = psaldo;
    }

    public boolean getStatus() { //Acc status getter method
        return this.statusConta;
    }

    public void setStatus(boolean pstatus) { //Acc status setter method
        this.statusConta = pstatus;
    }

    public boolean getStatMensalidade() { //Acc monthly maintenance payment getter method
        return statMensalidade;
    }

    public void setStatMensalidade(boolean pstatMensalidade) { //Acc monthly maintenance payment setter method
        this.statMensalidade = pstatMensalidade;
    }

    //Status method used to return the current value of all the attributes after object instantiation
    public void status() {
        System.out.println("\nSTATUS DA CONTA:\n");
        System.out.println("Número da conta: " + "000" + numConta);
        System.out.println("Tipo da conta: " + this.getTipoConta());
        System.out.println("Nome do Titular: " + this.getNome());
        System.out.printf("Saldo da conta: R$ %.2f\n", this.getSaldo());
        if (statMensalidade) { //Acc monthly maintenance payment set as fully paid if true, or payment due if false
            System.out.println("Mensalidade: Paga");
        } else {
            System.out.println("Mensalidade: A vencer");
        }
        if (statusConta) { //Acc current status set as Acc open if true or Acc closed if false
            System.out.println("Status da conta: Aberta");
        } else {
            System.out.println("Status da conta: Fechada");

        }
    }
    //endregion

    //abrirConta method is used to open a new bank account
    public void abrirConta() {
        System.out.println("\nQual tipo de conta deseja abrir? [CC/CP]"); //Asks for input of Acc type CC or CP
        String tipo_conta = scan.nextLine();
        if (Objects.equals(tipo_conta, "CC")) { //if CC Acc type is selected Acc gets a bonus of R$50 deposit and sets Acc status as "open"
            setTipoConta("CC");
            setSaldo(50.00f);
            setStatus(true);
        } else if (Objects.equals(tipo_conta, "CP")) { //if CP Acc type is selected Acc gets a bonus of R$150 deposit and sets Acc status as "open"
            setTipoConta("CP");
            setSaldo(150.00f);
            setStatus(true);
        } else { //if user input is different then CC/CP show error message on screen and sets Acc status as "closed"
            System.out.println("\nERRO: Tipo de conta Inválido");
            setStatus(false);
        }
    }

    //fecharConta method is used to close an open Acc
    public void fecharConta() {
        if (saldo == 0 && statMensalidade) { // To close the Acc balance must be 0 and monthly maintenance pay has to be made
            this.statusConta = false;
            System.out.println("Conta fechada com sucesso!\n");
        } else if (saldo > 0 || !statMensalidade) { // If Acc still has balance left or maintenence pay has not been made shows error message on screen alongside current status of balance and monthly maintenance payment
            System.out.println("\nERRO: NÃO É POSSÍVEL FECHAR A CONTA\n");
            System.out.println("Verifique o saldo disponível e o status da mensalidade\n");
            System.out.println("Saldo disponível: " + this.getSaldo());
            if (statMensalidade) {
                System.out.println("Mensalidade: Paga");
            } else {
                System.out.println("Mensalidade: A vencer");
            }
        }
    }

    //depositar method is used to make a deposit to the bank acc
    public void depositar(float pdeposito) {
        if (statusConta) { //Deposit is only possible if the bank acc status is set as "open"
            setSaldo(this.saldo + pdeposito);
            System.out.println("\nR$ " + pdeposito + " depositados com sucesso!\n");
        } else { // If bank acc status is set as "closed" shows error message and acc status on screen
            System.out.println("\nERRO: Não é possível realizar depósito\n");
            System.out.println("Status da conta: Fechada");
        }
    }

    //sacar method is used to withdraw money from the bank acc
    public void sacar(float psacar) {
        if (statusConta && this.saldo >= psacar && statMensalidade) { //withdrawal is only possible if acc status is set as "open", there's balance available and if the monthly maintenance payment has been made
            setSaldo(this.saldo - psacar);
            System.out.println("\nR$ " + psacar + " sacados com sucesso!\n");
        } else if (statusConta && psacar > this.saldo && statMensalidade) {
            System.out.println("\nERRO: Não foi possível realizar o saque\n");
            System.out.println("Saldo Insuficiente\n");
        } else if (!statMensalidade && statusConta) {
            System.out.println("\nERRO: Não foi possível realizar o saque\n");
            System.out.println("Mensalidade: A vencer\n");
        }
    }

    //pagarMensalidade method is used to make payment for the monthly acc maintenance
    public void pagarMensalidade() {
        System.out.println("\nDeseja fazer o pagamento da mensalidade? [SIM/NAO]"); //User input authorizes the payment to be made [YES/NO]
        String fazerPagamento = scan.nextLine();
        if (Objects.equals(fazerPagamento, "SIM")) { //If yes - payment is made using the current balance value and monthly maintenance attribute status is set to true
            float pagamento;
            if (Objects.equals(this.tipoConta, "CC")) { //CC Acc type payment value is R$12 and CP Acc types payment value is R$20
                pagamento = 12.00f;
            } else {
                pagamento = 20.00f;
            }
            setSaldo(this.saldo - pagamento);
            setStatMensalidade(true);
        } else { //If user chooses to not make the payment the monthly maintenance attribute status is set to false and a message is shown on screen advising that the payment was not made
            setStatMensalidade(false);
            System.out.println("\nMensalidade não foi paga\n");
        }
    }
}
