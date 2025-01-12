package Inheritance_01;

public class Main {
    public static void main(String[] args) {
        Professor professor = new Professor("Andre","Masculino",39,"Matematica", 2500.00);
        System.out.println(professor.getNome());
        System.out.println(professor.getSexo());
        System.out.println(professor.getIdade());
        System.out.println(professor.getEspecialidade());
        System.out.println(professor.getSalario());
        professor.recebeAumento(879.35);
        professor.fazerAniver();
        System.out.println(professor.getSalario());
        System.out.println(professor.getIdade());
    }
}