public class Usuario {

    private static int proxId = 1;
    private int id;
    private String nome;
    private String senha;

    public Usuario (String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
        this.id = proxId;
        proxId++;
    }
    public String getSenha() {
        return senha;
    }
    public String getNome() {
        return nome;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
}
