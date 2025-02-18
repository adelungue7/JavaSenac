
package javasenacaula1.ExerciciosBasicos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.0");
        
        System.out.print("Digite a nota 1: ");
        double nota1 = input.nextDouble();
        System.out.print("Digite a nota 2: ");
        double nota2 = input.nextDouble();
        System.out.print("Digite a nota 3: ");
        double nota3 = input.nextDouble();
        
        double media = (nota1 + nota2 + nota3) / 3;
        
        System.out.println("A média entre as três notas digitadas é de: " + df.format(media));
    }
}
