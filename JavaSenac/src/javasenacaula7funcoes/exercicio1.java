package javasenacaula7funcoes;
import java.util.Scanner;
public class exercicio1 {
    
    
    
    public static String obterNome() {
        Scanner input = new Scanner(System.in);
        System.out.print("Aluno: ");
        String nome = input.nextLine();
        return nome;
    }
    
    public static float obterNota() {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Nota: ");
        float nota = input.nextFloat();
        return nota;
    }
    
    public static float calcularMedia(float n1, float n2, float n3) {
        System.out.println("CALCULO DA MÉDIA");
        float media = (n1+n2+n3) / 3;
        return media;
    }
    
   public static char obterConceito(float media) {
       System.out.println("Obter Conceito");
       char conceito;
       if (media >= 9 && media <=10) {
           conceito = 'A';
       }
       else if (media >= 8 && media < 9){
           conceito = 'B';
       }
       else if (media >= 7 && media < 8) {
           conceito = 'C';
       }
       else if (media >= 6 && media < 7) {
           conceito = 'D';
       }
       else {
           conceito = 'E';
       }
       return conceito;
   }
   
   public static String obterStatus(char conceito) {
       System.out.println("Obter Status");
       String status = "";
       switch(conceito) {
           case 'A':
           case 'B':
           case 'C':
           case 'D':
               status = "Aprovado";
               break;
               
           case 'E':
               status = "Reprovado!";
               break;
       }
       return status;
   }
   
   public static void imprimirDados(String nome, float media, char conceito, String status) {
       System.out.println("IMPRIMIR DADOS");
       System.out.println("Aluno:" + nome + 
               "\nMédia: " + media + 
               "\nConceito: " + conceito + 
               "\nStatua" + status);
   }
    
    public static void main(String[] args) {
        String nome = obterNome();
        float n1 = obterNota();
        float n2 = obterNota();
        float n3 = obterNota();
        float media = calcularMedia(n1, n2, n3);
        char conceito = obterConceito(media);
        String status = obterStatus(conceito);
        imprimirDados(nome, media, conceito, status);
   }
}

