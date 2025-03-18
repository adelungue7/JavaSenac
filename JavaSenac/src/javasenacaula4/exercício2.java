package javasenacaula4;

import java.util.Random;
import java.util.Scanner;

public class exercício2 {
    public static void main(String[] args) {
        
    Random rnd = new Random();
    Scanner input = new Scanner(System.in);
    
    int n = rnd.nextInt(100);
    
    System.out.print("Digite o limite de tentativas: "); 
    int tentativas = input.nextInt( );

    for (int i = 0; i<tentativas; i ++) {
        System.out.print("Digite um número de 0 a 99: ");
        int n1 = input.nextInt( );
        if (n1 > n) {
            System.out.println("MENOR!");
            }
        else if (n1 < n) { 
            System.out.println("MAIOR!"); 
            }
        else if(n1 == n) { 
            System.out.println("Parabéns, você acertou o número " + n + "que sorteamos!");
            i = tentativas + 1;
            }
        }
        System.out.println("Acabaram as suas tentativas ou você acertou!");
    }
}
