package javasenacaula7funcoes;
import java.util.Scanner;
public class exercicio2 {
    
     public static String obterNome() {
        Scanner input = new Scanner(System.in);
        System.out.print("Qual o seu nome? ");
        String nome = input.nextLine();
        return nome;
    }
     
      public static double obterSalario() {
        
        Scanner input = new Scanner(System.in);
        double salario = 0;
        do {
        System.out.print("Salário: R$");
        salario = input.nextDouble();
        if(salario < 0) {
            System.out.println("O seu salário é inválido!");
        }
        }
        while(salario < 0);
        return salario;
    }
     
      public static double reajusteDoSalario(double salario) {
          Scanner input = new Scanner(System.in);
          double reajuste = 0;
          double salarioReajustado = 0;
          if (salario < 150) {
              reajuste = 25;
           salarioReajustado += salario;
           salarioReajustado += salario * (reajuste /100);
       }
       else if (salario >= 150 && salario <= 300) {
              reajuste = 20;
           salarioReajustado += salario;
           salarioReajustado += salario * (reajuste /100);
       }
       else if (salario > 300 && salario <= 600) {
              reajuste = 15;
           salarioReajustado += salario;
           salarioReajustado += salario * (reajuste /100);
       }
       else if (salario > 600) {
              reajuste = 10;
           salarioReajustado += salario;
           salarioReajustado += salario * (reajuste /100);
       }
          return salarioReajustado;
      }
      
      public static double diferencaSalarios(double salario, double salarioReajustado) {
          double diferencaDeSalarios = salarioReajustado - salario;
          return diferencaDeSalarios;
      }
      
      public static void imprimirDados(String nome, double salario, double salarioReajustado, double diferencaDeSalarios) {
       System.out.println("IMPRIMIR DADOS");
       System.out.println("Nome: " + nome
       + "\nSalário inicial: R$" + salario
       + "\nSalário reajustado: R$" + salarioReajustado
       + "\nA diferença entre o salário inicial e o salário reajustado é de: R$" + diferencaDeSalarios);
   }

     public static void main(String[] args) {
         String nome = "";
           do {
        nome = obterNome();
        if (nome.equalsIgnoreCase("FIM")) {
            System.out.println("Programa finalizado.");
            return; // ou use break se preferir
        }

        double salario = obterSalario();
        double salarioReajustado = reajusteDoSalario(salario);
        double diferencaSalarios = diferencaSalarios(salario, salarioReajustado);
        imprimirDados(nome, salario, salarioReajustado, diferencaSalarios);

    } while (!nome.equalsIgnoreCase("FIM"));
    }
}
