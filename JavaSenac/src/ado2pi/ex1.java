package ado2pi;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Escreva o primeiro valor: ");
        double n1 = input.nextDouble();
        
        System.out.print("Escreva o segundo valor: ");
        double n2 = input.nextDouble();
        
        System.out.print("Escreva o terceiro valor: ");
        double n3 = input.nextDouble();
        
        System.out.println("Primeiro valor: " + n1 + ", Segundo valor: " + n2 + ", Terceiro valor: " + n3);
    }
}
