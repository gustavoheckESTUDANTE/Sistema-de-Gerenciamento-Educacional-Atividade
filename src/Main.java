import Entities.Aluno;
import Entities.GerAlunos;
import Entities.Insercao;
import Entities.Turma;
import Exceptions.InsercaoInvalidaException;

import java.util.ArrayList;
import java.util.Scanner;
import Enum.Materia;

public class Main {
    public static final Scanner SC = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        int escolhaUsuario = SC.nextInt();
        while (true) {
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
            case 1: {
                cadastrarAluno();
                break;
            }
            case 2: {
                break;
            }
            case 3: {
                break;
            }
            case 4: {
                break;
            }
            case 5: {
                break;
            }
        }
    }

    public static void cadastrarAluno() {
        String nome;
        do {
            System.out.println("Insira o nome do aluno:");
            nome = Insercao.inserString();
        } while (nome == null);
        String senha;
        do {
            System.out.println("Insira a senha do aluno:");
            senha = Insercao.inserString();
        } while (senha == null);
        GerAlunos.cadastrarAluno(new Aluno(nome, senha));
    }

    public static void atribuirNotas() {
        String nome;
        do {
            System.out.println("Insira o nome do aluno:");
            nome = Insercao.inserString();
        } while (nome == null);
        int count = 1;
        ArrayList<Aluno> alunosSelecionados = GerAlunos.buscarAlunoNome(nome);
        for (Aluno aluno : alunosSelecionados) {
            System.out.println(count + " - NOME: " + aluno.getNome() + " - ID: " + aluno.getId());
            count++;
        }
        int escolha;
        do {
            escolha = (int) Insercao.inserNum(1, alunosSelecionados.size());
        } while (escolha);
    }
}