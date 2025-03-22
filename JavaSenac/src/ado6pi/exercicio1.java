package ado6pi;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int tentativas = 0;
        String alternativaEscolhida;
        String questao = "A jornada do usuário é um conceito fundamental no design de experiência "
                + "do usuário (UX) e no desenvolvimento de produtos digitais. Ela descreve o "
                + "caminho que um usuário percorre desde o primeiro contato com um produto ou serviço até alcançar "
                + "seu objetivo final.\n" +
                "\n" +
                "Considere um usuário que deseja comprar um par de tênis em uma loja online. Ele pode passar por diversas etapas, como:\n" +
                "\n" +
                "Descoberta: Encontra a loja por meio de um anúncio ou pesquisa.\n" +
                "Consideração: Explora diferentes modelos e lê avaliações.\n" +
                "Decisão: Escolhe o produto e adiciona ao carrinho.\n" +
                "Compra: Finaliza o pagamento.\n" +
                "Pós-compra: Recebe o produto e pode deixar uma avaliação.\n" +
                "Com base nesse exemplo, qual das alternativas melhor define a importância da jornada do usuário?\n" +
                "\n" +
                "A) Focar apenas na etapa de compra, pois é o objetivo final.\n" +
                "B) Analisar cada etapa para otimizar a experiência e aumentar a conversão.\n" +
                "C) Tornar o processo mais demorado para que o usuário passe mais tempo na plataforma.\n" +
                "D) Eliminar todas as etapas intermediárias para tornar o processo direto e rápido.\n" + 
                "E) Todas as alternativas estão incorretas.\n";
        
        do {
            System.out.println(questao);
            System.out.print("Qual a alternativa correta: ");
            alternativaEscolhida = input.next();
            switch (tentativas) {
            
            case 0:
                tentativas += 1;
                if ("b".equals(alternativaEscolhida) || "B".equals(alternativaEscolhida)) {
                    System.out.println("Resposta Correta!\n");
                    tentativas += 100;
                }
                else {
                    System.out.println("Resposta Incorreta!\n");
                }
                break;
                
            case 1:
                tentativas += 1;
                 if ("b".equals(alternativaEscolhida) || "B".equals(alternativaEscolhida)) {
                    System.out.println("Resposta Correta na tentativa " + tentativas + "!\n");
                    tentativas += 100;
                }
                else {
                    System.out.println("Resposta Incorreta!\n");
                }
                break;
                
            case 2:
                tentativas += 1;
                 if ("b".equals(alternativaEscolhida) || "B".equals(alternativaEscolhida)) {
                    System.out.println("Resposta Correta na tentativa " + tentativas + "!\n");
                    tentativas += 100;
                }
                else {
                    System.out.println("Resposta Incorreta!\n");
                }
                break;
                
            case 3:
                System.out.println("Resposta incorreta nas três tentativas");
                tentativas += 1;
                break;
            }
            }
        while (tentativas < 4);
    }
}
