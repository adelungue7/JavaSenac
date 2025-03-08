package ado4pi;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite um número de 1 a 7 correspondente a um dia da semana: ");
        int num = input.nextInt();
        String dia;
        
        switch(num) {
            
            case 1:
                dia = "Domingo";
                break;
            
            case 2:
                dia = "Segunda-feira";
                break;
                
            case 3:
                dia = "Terça-feira";
                break;
                
            case 4:
                dia = "Quarta-feira";
                break;
                
            case 5:
                dia = "Quinta-feira";
                break;
                
            case 6:
                dia = "Sexta-feira";
                break;
                
            case 7:
                dia = "Sábado";
                break;
                
            default:
                dia = "Valor inválido";
                break;
        }
        System.out.printf("O dia da semana é: %s\n", dia);
    }
}
