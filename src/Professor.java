import java.util.ArrayList;

public class Professor extends Usuario {
    Materia materia;
    ArrayList<Turma> turmas;
    Professor (String nome, String senha) {
        super(nome, senha);
        turmas = new ArrayList<>();
    }
}
