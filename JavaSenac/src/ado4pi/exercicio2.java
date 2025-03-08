package ado4pi;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Questão sobre Conceitos de Computação: \n");
        System.out.println("Os computadores foram criados para atender a diversas necessidades humanas. "
                + "Qual das alternativas melhor explica o principal motivo para a criação dos primeiros computadores?\n" +
"\n" +
"A) Para possibilitar o desenvolvimento de redes sociais e facilitar a comunicação entre pessoas ao redor do mundo.\n" +
"B) Para aprimorar os gráficos e a jogabilidade de videogames modernos.\n" +
"C) Para auxiliar na realização de cálculos complexos e automatizar processos matemáticos e científicos.\n" +
"D) Para substituir totalmente a mão de obra humana em todos os setores industriais.\n" +
"E) Para permitir que qualquer pessoa pudesse acessar a internet e buscar informações rapidamente.\n");
        
        System.out.print("Qual a sua resposta final: ");
        String resposta = input.next();
        
        switch (resposta) {
            
            case "A":
            case "a":
                System.out.println("Resposta Incorreta");
                System.out.println("A alternativa correta era a C)");
                break;
              
            case "B":
            case "b":
                System.out.println("Resposta Incorreta!");
                System.out.println("A alternativa correta era a C)");
                break;
                
            case "C":
            case "c":
                System.out.println("Resposta correta!");
                break;
                
            case "D":
            case "d":
                System.out.println("Resposta Incorreta!");
                System.out.println("A alternativa correta era a C)");
                break;
                
            case "E":
            case "e":
                System.out.println("Resposta Incorreta!");
                System.out.println("A alternativa correta era a C)");
                break;
                
            default:
                System.out.println("Resposta inválida!");
                System.out.println("A alternativa correta era a C)");
                break;
        }
    }
}
