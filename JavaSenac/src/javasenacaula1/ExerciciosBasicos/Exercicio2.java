
package javasenacaula1.ExerciciosBasicos;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro: ");
        int num = input.nextInt();
        
        System.out.println("O dobro desse número é: " + num * 2);
    }
    
}
