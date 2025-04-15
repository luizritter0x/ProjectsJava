package Prova;

public class prova1 {
    public static void main(String[] args) {
        
        int[] numeros = {5, 8, 10, 2, 7};
        double soma = 0;
        for (int n : numeros) soma += n;
        double media = soma / numeros.length;
        
        int count = 0;
        for (int n : numeros) if (n > media) count++;
        
        System.out.println("Quantidade maiores que a media: " +count);
        
    }
}
