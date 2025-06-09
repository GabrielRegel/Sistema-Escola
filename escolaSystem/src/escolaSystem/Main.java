package escolaSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        int opcaoPrincipal;
        int opcaoCadastro;

        // Loop principal do menu
        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Cadastrar Pessoa");
            System.out.println("2 - Listar Pessoas");
            System.out.println("0 - Sair");
            System.out.print("\nEscolha uma Opção: ");
            opcaoPrincipal = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer

            switch (opcaoPrincipal) {
                case 1:
                    System.out.println("\n1 - Aluno");
                    System.out.println("2 - Professor");
                    System.out.println("3 - Funcionário");
                    System.out.println("4 - Pessoa Comum");
                    System.out.println("0 - Cancelar");
                    System.out.print("Escolha o tipo de cadastro: ");
                    opcaoCadastro = scanner.nextInt();
                    scanner.nextLine(); // Limpa o buffer

                    if (opcaoCadastro == 0) {
                        break;
                    }

                    // Dados comuns
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();

                    System.out.print("Idade: ");
                    int idade = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Email: ");
                    String email = scanner.nextLine();

                    System.out.print("CPF: ");
                    String cpf = scanner.nextLine();

                    switch (opcaoCadastro) {
                        case 1: // Aluno
                            System.out.print("Curso: ");
                            String curso = scanner.nextLine();
                            
                            System.out.print("Turma: ");
                            String turma = scanner.nextLine();
                            
                            pessoas.add(new Aluno(nome, idade, email, cpf, curso, turma));
                            System.out.println("Aluno cadastrado com sucesso!");
                            break;
                            
                        case 2: // Professor
                            System.out.print("Disciplina: ");
                            String disciplina = scanner.nextLine();
                            
                            System.out.print("Formação: ");
                            String formacao = scanner.nextLine();
                            
                            pessoas.add(new Professor(nome, idade, email, cpf, disciplina, formacao));
                            System.out.println("Professor cadastrado com sucesso!");
                            break;
                            
                        case 3: // Funcionário
                            System.out.print("Profissão: ");
                            String profissao = scanner.nextLine();
                            
                            System.out.print("Departamento: ");
                            String departamento = scanner.nextLine();
                            
                            pessoas.add(new Funcionario(nome, idade, email, cpf, profissao, departamento));
                            System.out.println("Funcionário cadastrado com sucesso!");
                            break;
                            
                        case 4: // Pessoa Comum
                            pessoas.add(new Pessoa(nome, idade, email, cpf));
                            System.out.println("Pessoa cadastrada com sucesso!");
                            break;
                            
                        default:
                            System.out.println("Opção inválida.");
                    }
                    break;
                    
                case 2:
                    System.out.println("\n===== LISTA DE PESSOAS =====");
                    if (pessoas.isEmpty()) {
                        System.out.println("Nenhuma pessoa cadastrada.");
                    } else {
                        for (Pessoa pessoa : pessoas) {
                            System.out.println(pessoa);
                            System.out.println("----------------------");
                        }
                    }
                    break;
                    
                case 0:
                    System.out.println("Saindo...");
                    break;
                    
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcaoPrincipal != 0);
        
        scanner.close();
    }
}
