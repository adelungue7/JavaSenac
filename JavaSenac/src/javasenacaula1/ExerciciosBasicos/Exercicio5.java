package javasenacaula1.ExerciciosBasicos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        
        System.out.println("Vamos calcular a área de seu triângulo.");
        System.out.print("Qual a base de seu triângulo: ");
        double base = input.nextDouble();
        System.out.print("Qual a altura de seu triângulo: ");
        double altura = input.nextDouble();
        
        double area = (base * altura) / 2;
        
        System.out.println("A área de seu triângulo é de: " + df.format(area));
    }
}
