package javasenacaula1.ExerciciosBasicos;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int temp = n1;
        n1 = n2;
        n2 = temp;
        
        System.out.println("Número 1: " + n1 + ", número 2: " + n2);
    }
    
}
