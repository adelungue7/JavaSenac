package javaasenacaula5;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int qteNum = 0;
        int maiorNumero = 0;
        
        while(qteNum < 10) {
            
            qteNum ++;
            System.out.printf("Digite o %d° número: ", qteNum);
            int num = input.nextInt();
            if (num > maiorNumero) {
                maiorNumero = num;
            }
        }
        System.out.println("O maior número entre todos os digitados foi: " + maiorNumero + ".");
    }
}
