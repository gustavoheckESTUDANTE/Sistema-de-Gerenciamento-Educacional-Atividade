package Entities;
import Enum.Materia;

import java.util.ArrayList;
import java.util.HashMap;

public class Boletim {
    private final HashMap<Materia, ArrayList<Double>> boletim;

    public Boletim () {
        boletim = new HashMap<>();
        for (Materia materia : Materia.values()) {
            boletim.put(materia, new ArrayList<Double>());
        }
    }

    public void alterarNota (Materia materia, int indiceNota, double novaNota) {
        boletim.get(materia).set(indiceNota, novaNota);
    }
    public void adicionarNota (Materia materia, double nota) {
        boletim.get(materia).add(nota);
    }
    public void imprimirBoletim () {
        System.out.println("Entities.Boletim");
        for (Materia materia : Materia.values()) {
            double mediaAluno = 0;
            for (double nota : boletim.get(materia)) {
                mediaAluno += nota;
            }
            mediaAluno /= boletim.get(materia).size();
            System.out.println(materia.toString() + " = " + mediaAluno);
        }
    }
    public void removerNota (Materia materia, int indiceNota) {
        boletim.get(materia).remove(indiceNota);
    }
}
