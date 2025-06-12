package Empresa;

import java.sql.SQLException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        
        //CriarTabela CriarTabela = new CriarTabela();
        InserirFuncionario inserir = new InserirFuncionario();
        AtualizarFuncionario atualizar = new AtualizarFuncionario();
        DeletarFuncionario deletar = new DeletarFuncionario();
        ConsultarFuncionario consultar = new ConsultarFuncionario();
        Truncate Truncate = new Truncate();

    
        //CriarTabela.criar();
        
                int op = -1;
        while (op != 0) {
            System.out.println("\n ## MENU CRUD FUNCIONARIOS ##");
            System.out.println("1. Inserir funcionario");
            System.out.println("2. Atualizar funcionario");
            System.out.println("3. Deletar funcionario");
            System.out.println("4. Limpar tabela");
            System.out.println("5. Consultar funcionario");            
            System.out.println("0. Sair");
            System.out.println("Escolha uma opção: ");
            op = sc.nextInt();
            sc.nextLine();
            
                    switch (op) {
                case 1:
                    System.out.println("Nome: ");
                    String nomeInserir = sc.nextLine();
                    System.out.println("Cargo: ");
                    String cargoInserir = sc.nextLine();                    
                    inserir.inserir(nomeInserir, cargoInserir);
                    break;
                case 2:
                    System.out.println("Nome do funcionario para atualizar o cargo: ");
                    String nomeAtualizar = sc.nextLine();
                    System.out.println("Novo cargo: ");
                    String novoEmail = sc.nextLine();
                    atualizar.atualizar(nomeAtualizar, novoEmail);
                    break;
                case 3:
                    System.out.println("Nome do funcionario para deletar: ");
                    String nomeDeletar = sc.nextLine();
                    deletar.deletar(nomeDeletar);
                    break;
                case 4:
                    System.out.println("Qual tabela voce quer limpar? ");
                    String tabelaLimpar = sc.nextLine();
                    System.out.println("Tabela limpa com sucesso!");
                    Truncate.Truncate(tabelaLimpar);
                    break;
                case 5:
                    consultar.consultar();
                    break;
                case 0:
                    System.out.println("Encerrando o programa ...");
                    break;
                default:
                    System.out.println("Opção inválida");                  
                    
                }
            }
         sc.close();   
    }
}
