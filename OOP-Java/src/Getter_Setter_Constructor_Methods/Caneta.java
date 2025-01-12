package Getter_Setter_Constructor_Methods;

public class Caneta {

    private String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;

    public Caneta(String c,String m, float p){ //Constructor method has the same name as the class.
        this.tampar();
        this.cor = c;
        this.modelo = m;
        this.ponta = p;
    }

    public String getModelo(){
        return this.modelo;
    }

    public void setModelo(String m){
        this.modelo = m;
    }

    public float getPonta(){
        return this.ponta;
    }

    public void setPonta (float p){
        this.ponta = p;
    }

    public void tampar(){
        this.tampada=true;
    }

    public void destampar(){
        this.tampada=false;
    }

    public boolean getTampada(){
        return this.tampada;
    }

    public String getCor(){
        return this.cor;
    }



    public void status(){
        System.out.println("SOBRE A CANETA:");
        System.out.println("Modelo: "+this.getModelo());
        System.out.println("Ponta:"+this.getPonta());
        System.out.println("Cor:"+this.getCor());
        System.out.println("Tampada? "+this.getTampada());
    }

}
