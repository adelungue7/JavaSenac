package javaasenacaula5;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Quantos alunos tem na sua sala de aula: ");
        int alunos = input.nextInt();
        int qtdeAlunos = alunos;
        double soma = 0;
        int cont = 1;
        
        while(alunos > 0) {
            
            System.out.printf("Qual a nota do aluno %d: ", cont);
            double nota = input.nextDouble();
            soma += nota;
            alunos --;
            cont ++;
        }
        System.out.printf("A média desses alunos é de %.2f.\n", soma / qtdeAlunos);
    }
}
