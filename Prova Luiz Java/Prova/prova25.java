package Prova;

import java.util.HashSet;
import java.util.Scanner;

public class prova25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palavra =  sc.nextLine().toLowerCase();
                    HashSet<Character> letras = new HashSet<>();
                    
                    for(char c : palavra.toCharArray()) {
                        if(!letras.add(c)) {
                            System.out.println("Tem letras repetidas");
                                return;
                        }
                    }
                            System.out.println("Não tem letras repetidas");
    }
}
