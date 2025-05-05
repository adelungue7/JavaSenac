package ado9pi;

import java.util.Random;
import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Random rnd = new Random();

        System.out.print("Digite o min: ");
        int min = scanner.nextInt();
        System.out.print("Digite o max: ");
        int max = scanner.nextInt();

        int a;
        do {
            a = rnd.nextInt((max - min) + 1) + min;
        } while (a == 0);

        int b = rnd.nextInt((max - min) + 1) + min;

        System.out.println("Equação gerada: " + a + "x + " + b + " = 0");

        double x = - (double) b / a;
        System.out.printf("Solução: x = %.2f\n", x);
    }
}
