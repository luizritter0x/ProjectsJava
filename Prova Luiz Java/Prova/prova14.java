package Prova;

import java.util.ArrayList;
import java.util.Scanner;

public class prova14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            ArrayList<String> lista = new ArrayList<>();
            int opcao;
            
            do {
                System.out.println("1 - Cadastro");
                System.out.println("2 - Listar");
                System.out.println("3 - Sair Do Menu");
                
                System.out.println("Escolha");
                    opcao = sc.nextInt();
                    sc.nextLine();
                    
                    if (opcao == 1 ) {
                        System.out.println("Digite o nome: ");
                        String nome = sc.nextLine();
                            lista.add(nome);
                    }else if (opcao == 2) {
                        System.out.println("Lista: " +lista);
                    }
            } while (opcao != 3);
    }
}
