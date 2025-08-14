package Enum;

public enum Materia {
    PORT("Português"),
    MAT("Matemática"),
    QUI("Química"),
    FIS("Física"),
    HIS("História"),
    SOC("Sociologia"),
    FIL("Filosofia"),
    BIO("Biologia"),
    EDUFI("Educação Física"),
    ING("Inglês");

    private final String nomeFormatado;

    Materia(String nomeFormatado) {
        this.nomeFormatado = nomeFormatado;
    }

    @Override
    public String toString() {
        return nomeFormatado;
    }
}
