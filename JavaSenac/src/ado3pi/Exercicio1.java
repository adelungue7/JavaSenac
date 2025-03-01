package ado3pi;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double desconto = 0;
        
        System.out.println("Vamos calcular o seu desconto!");
        System.out.print("Qual o valor do seu produto: R$");
        double valorProduto = input.nextDouble();
        
        if (valorProduto >= 300) {
            desconto = 15;
            double valorFinalProduto = valorProduto - (valorProduto * (desconto/100));
            System.out.printf("Com o desconto de %.0f porcento o seu "
                    + "produto vai ter o valor final de: R$%.2f", desconto, 
                    valorFinalProduto);
            System.out.println("");
        }
        else {
            desconto = 10;
            double valorFinalProduto = valorProduto - (valorProduto * (desconto/100));
            System.out.printf("Com o desconto de %.0f porcento o seu "
                    + "produto vai ter o valor final de: R$%.2f", desconto, 
                    valorFinalProduto);
            System.out.println("");
        }
    }
}
