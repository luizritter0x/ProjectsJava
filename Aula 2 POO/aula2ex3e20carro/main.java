package aula2ex3e20carro;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Carros c1 = new Carros("Fiat", "Uno", 2012, false);

        System.out.println("Informações do Veículo:");
        System.out.println("Marca: " + c1.marca);
        System.out.println("Modelo: " + c1.modelo);
        System.out.println("Ano: " + c1.ano);
        System.out.println("Estado do veículo: " + c1.ligado);

        System.out.println("Deseja ligar o veículo? (sim/não)");
        String opcao = sc.nextLine();

        if (opcao.equalsIgnoreCase("sim")) {

            c1.ligar();
            System.out.println("O veículo foi ligado!");
            System.out.println("Deseja acelerar o veículo?");
            opcao = sc.nextLine();
            if (opcao.equalsIgnoreCase("sim")) {
                c1.acelerar();
            }

        } else if (opcao.equalsIgnoreCase("nao")) {

            System.out.println("O veículo continua desligado.");
            sc.close();

        } else if (c1.ligado = true) {

            System.out.println("Deseja desligar o veículo?(sim/não)");
            String opcao2 = sc.nextLine();
            if (opcao2.equalsIgnoreCase("sim")) {
                c1.desligar();
                System.out.println("O veículo foi desligado!");

            } else {
                sc.close();
            }

        }

    }

}
