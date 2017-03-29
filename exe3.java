package exepi;

import java.util.Scanner;

public class exe3 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Nota da primeira prova: ");
        double p1 = Double.parseDouble(read.nextLine());
        System.out.println("Nota da segunda prova: ");
        double p2 = Double.parseDouble(read.nextLine());

        double media1 = (p1 + p2) / 2;

        boolean passou = (media1 >= 6.0);
        if (passou) {
            System.out.println("Aluno aprovado!");
        } else {
            System.out.println("Aluno reprovado. Faça a prova substitutiva!");
            System.out.println("");
            System.out.println("=== Após a substitutiva ===");

            System.out.println("Digite a nota da terceira nota: ");
            double p3 = Double.parseDouble(read.nextLine());
            double notamin = Math.min(p1, p2);
            if (notamin == p1) {
                double media2 = ((p2 + p3) / 2);
                if (media2 > 6.0) {
                    System.out.println("A nova média é: 6.0!");
                } else {
                    System.out.println("A nova média é: " + media2);
                }
            } else if (notamin == p2) {
                double media2 = ((p1 + p3) / 2);
                if (media2 > 6.0) {
                    System.out.println("A nova média é: 6.0!");
                } else {
                    System.out.println("A nova média é: " + media2);
                }
            }
        }
    }

}
