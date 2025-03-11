package javasenacaula3;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Qual o seu nome? ");
        String nome = input.next();
        System.out.print("Nota 1: ");
        double n1 = input.nextDouble();
        System.out.print("Nota 2: ");
        double n2 = input.nextDouble();
        
        double median = (n1 + n2) / 2;
        char media;
        
        if (median >= 9 && median <= 10) {
            media = 'A'; 
        }
        else if (median >= 8 && median <9) {
            media = 'B';
        }
        else if (median >= 7 && median <8) {
            media = 'C';
        }
        else if (median >= 6 && median <7) {
            media = 'D';
        }
        else if (median < 6 && median >= 0) {
            media = 'E';
        }
        else {
            System.out.println("Notas inválidas");
            media = '0';
        }
        
        switch(media) {
            
            case 'A':
                System.out.printf("Excelente %s!\n", nome);
                break;
                
            case 'B':
            case 'C':
                System.out.printf("Bem feito %s!\n!", nome);
                break;
                
            case 'D':
                System.out.printf("Você passou %s!\n!", nome);
                break;
                
            case 'E':
                System.out.printf("Melhor tentar novamente %s!\n!", nome);
                break;
                
            default:
                System.out.printf("Conceito inválido %s!\n!", nome);
                break;
                  
        }
    }
}
