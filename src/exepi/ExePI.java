
package exepi;

import java.util.Scanner;


public class ExePI {

    public static void main(String[] args) {

        //entradas
        Scanner console = new Scanner(System.in);

        System.out.println("Digite o valor de x1: ");
        double x1 = console.nextDouble();

        System.out.println("Digite o valor de x2: ");
        double x2 = console.nextDouble();

        System.out.println("Digite o valor de c: ");
        double c = Double.parseDouble(console.nextLine());

        //processamento
        double soma = x1 + x2;
        double prod = x1 * x2;

        double a = c / prod;
        double b = -(a * soma);

        //saida
        System.out.println(a + "x²" + b + "x+" + c + " = 0");
    }
    
}
