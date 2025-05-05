package javasenacaula7funcoes;

import java.util.Random;
import java.util.Scanner;

public class exercicio3 {
    
    
    public static int randInt(int min, int max) {
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }
    
    public static int userChoice() {
        Scanner input = new Scanner(System.in);
        System.out.println("PEDRA (0) ||| PAPEL (1) ||| TESOURA(2)");
        int number = input.nextInt();
        return number;
    }
    public static String winner(int computerNumber, int userNumber) {
        String winner = null;
        if (userNumber == computerNumber) {
            winner = "EMPATE!\n" + 
                    "O computador escolheu: " + computerNumber + 
                    "\nVocê escolheu: "  + userNumber;
        }
        else if (userNumber == 0 && computerNumber == 2 || 
                userNumber == 1 && computerNumber == 0 ||
                userNumber == 2 && computerNumber == 1) {
            winner = "VOCÊ VENCEU, PARABÉNS!\n" + 
                    "O computador escolheu: " + computerNumber + 
                    "\nVocê escolheu: "  + userNumber;
        }
        else {
            winner = "VOCÊ PERDEU, QUE PENA!\n" + 
                    "O computador escolheu: " + computerNumber + 
                    "\nVocê escolheu: "  + userNumber;
        }
        return winner;
    }
    public static void main(String[] args) {
        System.out.println("VAMOS JOGAR PEDRA, PAPEL OU TESOURA!");
        System.out.println("\nQUAL VAI SER A SUA ESCOLHA?");
        int userNumber = userChoice();
        int computerNumber = randInt(0, 2);
        System.out.println(winner(computerNumber, userNumber));
    }
}
