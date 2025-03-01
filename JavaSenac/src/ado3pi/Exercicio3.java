package ado3pi;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite a medida dos 3 lados de um triângulo: ");
        System.out.print("Lado 1: ");
        int lado1 = input.nextInt();
        System.out.print("Lado 2: ");
        int lado2 = input.nextInt();
        System.out.print("Lado 3: ");
        int lado3 = input.nextInt();
        
        if (lado3 < lado1 + lado2 && lado2 < lado3 + lado1 
                && lado3 < lado1 + lado2) {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Seu triãngulo é equilátero!");
            }
            else if (lado1 == lado2 || lado1 == lado3 || lado3 == lado2) {
                System.out.println("Seu triângulo é isósceles!");
            }
            else {
                System.out.println("Seu triângulo é escaleno!");
            }
        }
        else {
            System.out.println("Esses lados não formam um triângulo!");
        }
    }
}
