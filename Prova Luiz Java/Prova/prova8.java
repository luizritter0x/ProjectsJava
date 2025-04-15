package Prova;

import java.util.ArrayList;

public class prova8 {   
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = {3, 4, 5, 6};
        
                ArrayList<Integer> intersecao = new ArrayList<>();
                
                    for (int i : a) {
                        for ( int j : b) {
                            if ( i == j && ! intersecao.contains(i)) {
                                intersecao.add(i);
                            }
                        }
                    }
                    System.out.println("Interseção: " +intersecao);
    }
}
