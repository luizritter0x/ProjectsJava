package Prova;

import java.util.HashSet;
import java.util.Scanner;

public class prova33 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        HashSet<String> estoque = new HashSet<>();
        
        for(int i = 0; i < 5; i++) {
            System.out.println("Adicione um produto ao estoque: ");
            String produto = sc.nextLine().toLowerCase();
            estoque.add(produto);
        }
        System.out.println("Digite o nome de um produto para verificar");
        String busca = sc.nextLine().toLowerCase();
            if(estoque.contains(busca)) {
                System.out.println("Produto existe no estoque");
            } else {
                System.out.println("Produto nao existe no estoque");
           }    
   }
}
