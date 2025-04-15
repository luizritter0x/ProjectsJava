package Prova;

public class prova12 {
    public static void main(String[] args) {
        double[] numeros = {2.5, 5.5, 7.5, 9.5, 8.0};
        double media = mediaMaiorQueCinco(numeros);
        System.out.println("Media maiores que 5: " + media);
        }
            public static double mediaMaiorQueCinco(double[] array) {
               double soma = 0;
               int cont = 0;
               
               for (double n : array) {
                   if(n > 5.0) {
                       soma += n;
                       cont++;
                   }
               }
               return cont > 0 ? soma / cont : 0;
    }
}
