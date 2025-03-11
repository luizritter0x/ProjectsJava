package ExercicioSemCalculos;

import java.util.Scanner;

public class ComparadorDePalavras {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite uma palavra");
        String palavra1 = teclado.nextLine();
        
        System.out.println("Digite a segunda palavra");
        String palavra2 = teclado.nextLine();
        
        if (palavra1.equalsIgnoreCase(palavra2)) {
            System.out.println("As palavras são iguais");
        }else{
            System.out.println("As palavras não são iguais");
        }
    }

}
