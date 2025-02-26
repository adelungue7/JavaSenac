package ado2pi;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
            System.out.print("Digite seu nome: ");
            String nome = input.next();
            
            System.out.println("Seu nome contém: " + nome.length() + " caracteres!");
            
    }
}
