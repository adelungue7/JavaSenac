package ado5pi;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int escolha;
        
        do {
        System.out.print("Menu do Jogo\n\n1 - Instruções\n2 - Jogar\n3 - Créditos\n4 - Sair\n\n");
            System.out.print("Qual a opção você deseja selecionar? ");
        escolha = input.nextInt();
            System.out.println();
        
        switch(escolha) {
            
            case 1:
                System.out.print("É necessário passar todos os cinco níveis para vencer o jogo,"
                        + " não se esqueça que você tem apenas 5 vidas.\n\n");
                break;
                
            case 2:
                System.out.print("O jogo vai começar prepare-se!\n\n");
                break;
                
            case 3:
                System.out.print("O jogo foi desenvolvido pela equipe TeamSenac, "
                        + "com os desenvolvedores Rafael Adelungue e Gustavo Viana\n\n");
                break;
                
            case 4:
                System.out.print("Até a próxima!\n\n");
                break;
                
            default:
                System.out.print("Opção inválida, digite novamente.\n\n");
                break;
        }
        }
        while (escolha != 4);
    }
}
