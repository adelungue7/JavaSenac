package javasenacaula1.ExerciciosBasicos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        
        System.out.print("Digite o valor do raio de sua circunferência: ");
        
        double pi = 3.14159265359;
        double raio = input.nextDouble();
        double comprimento = 2 * pi * raio;
        
        System.out.println("O comprimento de sua circunferência é de: " + df.format(comprimento));
    }
}
