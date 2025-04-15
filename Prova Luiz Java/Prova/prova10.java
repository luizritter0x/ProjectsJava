package Prova;

import java.util.LinkedHashSet;
import java.util.Set;

public class prova10 {
    public static void main(String[] args) {
        
        int[] numeros = {1, 2, 2, 3, 4, 4, 5, 5};
        Set<Integer> semRep = new LinkedHashSet<>();
        
            for(int n : numeros) {
                semRep.add(n);
            }
                System.out.println("Arrays sem repetiçoes: " +semRep);
    }
}
