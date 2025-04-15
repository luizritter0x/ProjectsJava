package Prova;

import java.util.ArrayList;
import java.util.Scanner;

public class prova2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();
        
        for( int i = 1; i <= 10; i++) {
            System.out.println("Digite o nome do aluno " + i + ": ");
            String nome = sc.nextLine();
                nomes.add(nome);
        }
            System.out.println("Alunos com mais de 6 letras: " );
                for(String nome : nomes) {
                    if(nome.length() < 6) {
                        System.out.println(nome);
                    }
                }
    }
}
