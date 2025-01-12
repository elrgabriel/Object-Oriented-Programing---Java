package Visibility;

//Class 02 - Visibility
public class Main {


    public static void main(String[] args) {
        Caneta c1 = new Caneta(); //Pen nº1
        c1.modelo = "BIC Cristal";
        c1.cor = "Azul";
        // c1.ponta = 0.5f; It's not possible to update attribute "ponta" since its visibility is set as private.

        c1.carga = 80;
        //Attribute "carga" is protected, but since the "main" Method is inside a Class that utilizes
        // the "Caneta" Class, it's possible to modify the value of the protected attribute.

        //c1.tampada = true; visibility set as private
        c1.tampar();
        //A public method belonging to the same class as a private attribute has access and can change the attribute value

        c1.status();

    }
}