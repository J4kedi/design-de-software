package classes;

public class Usuario implements Autenticar {
    private String nome;
    private Integer idade;
    private String email;
    private String senha;
    private String cpf;

    public Usuario(String nome, Integer idade, String email, String senha, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.senha = senha;
        this.cpf = cpf;
    }

    public void alterarEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }
}
