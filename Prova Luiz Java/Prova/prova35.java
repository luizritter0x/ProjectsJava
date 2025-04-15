package Prova;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class prova35 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();
        
            while (true) {
                String nome = sc.nextLine();
                    if(nome.equalsIgnoreCase("fim")) break;
                        nomes.add(nome);
            }
                Collections.sort(nomes);
                for (String nome : nomes) {
                    System.out.println(nome);
                }
    }
}
