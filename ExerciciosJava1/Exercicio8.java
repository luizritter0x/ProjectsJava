package ExerciciosJava1;

import java.util.Scanner;

public class Exercicio8 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite o valor do produto: ");
        double precoInicial = teclado.nextDouble();
        
        double desconto = 5;
        
        double precoFinal = precoInicial * (desconto/100);
        System.out.println("O preco final é" +precoFinal);
        
    }
    
    
}
