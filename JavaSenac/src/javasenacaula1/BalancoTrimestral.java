package javasenacaula1;

import java.text.DecimalFormat;

public class BalancoTrimestral {

    public static void main(String[] args) {
        double janeiro = 1500.00;
        double fevereiro = 23000.00;
        double marco = 17000.00;
        
        DecimalFormat df = new DecimalFormat("#.00");
        
        double gastosTrimestre = janeiro + fevereiro + marco;
        
        System.out.println("O gasto trimestral foi de: R$" + df.format(gastosTrimestre));
        
        double media = (janeiro + fevereiro + marco) / 3;
        
        System.out.println("A média de gastos nesses 3 meses foi de: R$" + df.format(media));
    }
    
}
