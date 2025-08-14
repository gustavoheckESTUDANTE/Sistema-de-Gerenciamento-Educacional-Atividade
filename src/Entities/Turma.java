package Entities;

import java.util.ArrayList;

public class Turma {

    private String codigo;
    private boolean status;
    private ArrayList<Aluno> alunos;

    Turma (String codigo) {
        this.codigo = codigo;
        this.alunos = new ArrayList<>();
        this.status = true;
    }

    public void adicionaAlunoNaTurma (Aluno aluno) {
        this.alunos.add(aluno);
        if (!(aluno.getTurmas().contains(this))) {
            aluno.adicionaTurmaAAluno(this);
        }
    }
    public void desativarTUrma () {
        this.status = true;
    }
    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }
}
