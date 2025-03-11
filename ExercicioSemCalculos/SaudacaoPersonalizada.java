package ExercicioSemCalculos;

import java.util.Scanner;

public class SaudacaoPersonalizada {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
            
        System.out.println("Qual o seu nome?");
        String nome = teclado.nextLine();
        
        System.out.println("Qual turno voce estuda? (Manha, tarde, noite)");
        String turno = teclado.nextLine();
        
        if(turno.equalsIgnoreCase("Manha")){
            System.out.println("Bom dia " +nome+ "!");
        }else if
        (turno.equalsIgnoreCase("Tarde")){
            System.out.println("Boa Tarde " +nome+ "!");
        }else if
            (turno.equalsIgnoreCase("Noite")){
            System.out.println("Boa noite" +nome+ " ! ");
        }                         
    }

}
