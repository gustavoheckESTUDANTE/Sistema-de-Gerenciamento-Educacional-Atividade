package Entities;

import java.util.ArrayList;
import java.util.HashMap;

public class GerAlunos {
    private static final ArrayList<Aluno> alunos = new ArrayList<>();
    private static final HashMap<Aluno, Boletim> alunosBoletim = new HashMap<>();

    public static void cadastrarAluno(Aluno aluno) {
        alunos.add(aluno);
        alunosBoletim.put(aluno, new Boletim());
    }
    public static ArrayList<Aluno> buscarAlunoNome (String nome) {
        ArrayList<Aluno> alunosNome = new ArrayList<>();
        for (Aluno aluno : alunos) {
            if (aluno.getNome().equals(nome)) {
                alunosNome.add(aluno);
            }
        }
        return alunosNome;
    }
}
