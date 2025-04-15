package Prova;

import java.util.ArrayList;
import java.util.Scanner;

public class prova3 {
    public static void main(String[] args) {
        
        class produto {
            String nome;
            double preco;
            
            produto(String nome, double preco) {
                this.nome = nome;
                this.preco = preco;
            }
        }
            Scanner sc = new Scanner(System.in);
            ArrayList<produto> produtos = new ArrayList<>();
            
            for (int i = 1; i <= 5; i++) {
                System.out.println("Nome do produto" + i + " : ");
                    String nome = sc.nextLine();
                    
                    System.out.println("Digite o valor do produto: " + i + " : ");
                    double preco = sc.nextDouble();
                        sc.nextLine();
                    produtos.add(new produto(nome, preco));     
            }
                    System.out.println("Produtos acima de 100R$: ");
                        for(produto p : produtos) {
                                if(p.preco > 100) {
                                    System.out.println(p.nome + " - R$" + p.preco);
                                }
                        }
    }
}
