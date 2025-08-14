package Entities;

import java.util.ArrayList;

public class Aluno extends Usuario {
    ArrayList<Turma> turmas;

    Aluno (String nome, String senha) {
        super(nome, senha);
        turmas = new ArrayList<>();
    }

    public void adicionaTurmaAAluno(Turma turma) {
        this.turmas.add(turma);
        if (!(turma.getAlunos().contains(this))) {
            turma.adicionaAlunoNaTurma(this);
        }
    }
    public ArrayList<Turma> getTurmas() {
        return turmas;
    }
}
