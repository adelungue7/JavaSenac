package ado3pi;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Cálculo de ano bissexto");
        System.out.print("Digite um ano para análise: ");
        int ano = input.nextInt();
        
        if(ano % 4 == 0 && ano % 100 != 0) {
            System.out.printf("O ano %d é um ano bissexto!\n", ano);
        }
        else {
            System.out.printf("O ano %d não é um ano bissexto!\n", ano);
        }
    }
}
