package ado8pi;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class exercicio1 {
    public static void main(String[] args) {
        
        Random rnd = new Random();
        
        List <Integer> cubo = new ArrayList();
        
        double face1 = 0;
        double face2 = 0;
        double face3 = 0;
        double face4 = 0;
        double face5 = 0;
        double face6 = 0;
        
        for(int i = 0; i < 1000000; i++) {
            int numeroAleatorio = rnd.nextInt(1, 7);
            cubo.add(numeroAleatorio);
        }
        
        for(int i = 0; i < cubo.size(); i++) {
            
            switch(cubo.get(i)) {
                
                case 1:
                    face1++;
                    break;
                    
                case 2:
                    face2++;
                    break;
                    
                case 3:
                    face3++;
                    break;
                    
                case 4:
                    face4++;
                    break;
                    
                case 5:
                    face5++;
                    break;
                    
                case 6:
                    face6++;
                    break;
            }
        }
        System.out.println("Quanto em porcentagem cada uma das faces apareceu? ");
        System.out.printf("Face 1: %.5f porcento\nFace 2: %.5f porcento\nFace 3: %.5f porcento\n"
                + "Face 4: %.5f porcento\nFace 5: %.5f porcento\nFace 6: %.5f porcento\n"
        , face1/10000, face2/10000, face3/10000, face4/10000, face5/10000, face6/10000);
    }
}
