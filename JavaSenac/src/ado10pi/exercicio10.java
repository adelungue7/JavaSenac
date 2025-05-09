package ado10pi;

import java.util.Random;
import java.util.Scanner;

public class exercicio10 {
    
    public static void main(String[] args) {
        
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        
        int  numeroComputador = rand.nextInt(1, 100);
        int numeroJogador = 0;
        int tentativas = 0;
        System.out.println("Vamos jogar!\nVOCÊ TERÁ QUE ADIVINHAR UM NÚMERO DE 1 A 100!");
        
        while(true) {
            if(tentativas == 5) {
                System.out.println("GAME OVER!");
                break;
            }
            System.out.printf("%d° tentativa: ", tentativas + 1);
            numeroJogador = input.nextInt();
            if(numeroJogador == numeroComputador - 1 || numeroJogador == numeroComputador + 1) {
                System.out.println("TÁ QUENTE!");
            }
            else if(numeroJogador < numeroComputador) {
                System.out.println("É MAIOR DO QUE ISSO!");
            }
            else if(numeroJogador > numeroComputador){
                System.out.println("É MENOR DO QUE ISSO!");
            }
            else {
                System.out.println("PARABÉNS VOCÊ GANHOU!");
                break;
            }
            tentativas += 1;
        }
    }
}
