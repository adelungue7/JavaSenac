package ado2pi;

import java.util.Scanner;

public class ex2 {
     public static void main(String[] args) {
        
            Scanner input = new Scanner(System.in);
        
        System.out.print("Digite um valor inteiro: ");
        int n1 = input.nextInt();
        
        System.out.println("Primeiro múltiplo: " + n1 * 2 + ", Segundo múltiplo: " + n1 * 3 + ", Terceiro múltiplo: " + n1 * 4);
        
    }
}
