import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static final Scanner SC = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        int escolhaUsuario = SC.nextInt();
        while(true) {
            try {
                System.out.println("""
                        Bem vindo professor!
                        1-Cadastrar Aluno
                        2-Adicionar Notas
                        3-Atualizar Nota
                        4-Ver Boletim
                        5-Sair
                        Escolha uma opção:""");
                if (escolhaUsuario < 1 || escolhaUsuario > 5) {
                    throw new Exception("Número Inválido");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        switch (escolhaUsuario) {
            case 1 : {
                cadastrarAluno();
                break;
            }
            case 2 : {
                break;
            }
            case 3 : {
                break;
            }
            case 4 : {
                break;
            }
            case 5 : {
                break;
            }
        }
    }
    public static void cadastrarAluno () throws Exception {
        String nome = SC.next();
        while (true) {
            try {
                System.out.println("Insira o nome do aluno:");
                if (nome.isBlank()) {
                    throw new Exception("Nenhum valor foi inserido");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        GerAlunos.cadastrarAluno(nome);
    }
    public static void atribuirNotas () throws Exception {
        int idAluno = SC.nextInt();
        while (true) {
            try {
                System.out.println("Insira o ID do aluno na qual você deseja adicionar uma nota");
                if (idAluno < 1) {
                    throw new Exception("Número inválido, entre 1 e n são aceitos!");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

    }
}