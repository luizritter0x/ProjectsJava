/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex5;

import java.util.Scanner;

/**
 *
 * @author Luiz
 */
public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);

        System.out.println("O funcionário é horista ou assalariado?");
        String opcao = sc.nextLine();

        if (opcao.equalsIgnoreCase("horista")) {
            System.out.println("Digite o nome do funcionário: ");
            String nome1 = sc.nextLine();
            System.out.println("Digite o cargo: ");
            String cargo1 = sc.nextLine();
            System.out.println("Digite as horas trabalhadas: ");
            double horas = sc2.nextInt();
            System.out.println("Digite o valor a receber por hora: ");
            double salario = sc3.nextDouble();

            FuncionarioHorista FH = new FuncionarioHorista(nome1, cargo1, horas, salario);
            
            FH.calcularPagamento();
            System.out.println("Salario do funcionario: "+FH.calcularPagamento());
            
        }else if(opcao.equalsIgnoreCase("assalariado")){
            
            System.out.println("Digite o nome do funcionário: ");
            String nome2 = sc.nextLine();
            System.out.println("Digite o cargo: ");
            String cargo2 = sc.nextLine();
            System.out.println("Digite a quantidade de dias trabalhados: ");
            int dias = sc2.nextInt();
            System.out.println("Digite o valor a receber por dia: ");
            double salario = sc3.nextDouble();
            
            
            FuncionarioAssalariado FA = new FuncionarioAssalariado(nome2,cargo2,dias,salario);
            
            FA.calcularPagamento();
            System.out.println("Salário do funcionário: "+FA.calcularPagamento());
        }

    }

}
