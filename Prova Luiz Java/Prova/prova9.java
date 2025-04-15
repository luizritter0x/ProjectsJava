package Prova;

import java.util.HashSet;
import java.util.Scanner;

public class prova9 {  
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        HashSet<String> animais = new HashSet<>();
        
        System.out.println("Digite nome de animais (sair para finalizar)");
            while(true) {
                String nome = sc.nextLine();
            if(nome.equalsIgnoreCase("sair"));
            if(!animais.add(nome))
            {    
                System.out.println("Duplicado: " +nome);   
            }
                System.out.println("Animais unicos: " +animais);
            }
    }
}
