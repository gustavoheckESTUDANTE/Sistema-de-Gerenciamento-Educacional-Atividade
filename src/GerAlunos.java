import java.util.HashMap;

public class GerAlunos {
    private static final HashMap<Integer, String> alunosNome = new HashMap<>();
    private static final HashMap<Integer, Boletim> alunosBoletim = new HashMap<>();
    private static int proxNum = 1;

    public GerAlunos () {

    }

    public static void cadastrarAluno(String nome) {
        alunosNome.put(proxNum, nome);
        alunosBoletim.put(proxNum, new Boletim());
        proxNum++;
    }

}
