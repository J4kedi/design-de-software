package classes;

import java.sql.Date;

import services.Autenticavel;

public class Usuario implements Autenticavel {
    private String nome;
    private String senha;
    private String email;
    private String cpf;
    private Date dt_nasc;
    private boolean isLogin;

    public Usuario(String nome, Integer idade, String email, String senha, String cpf, Date dt_nasc) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.cpf = cpf;
        this.dt_nasc = dt_nasc;
        this.isLogin = false;
    }

    public void autenticar(String email, String senha) {
        if(this.senha.equals(senha) && this.email.equals(email))
            isLogin = true;
        else 
            isLogin = false;
    }

    public void alterarEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }


    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public Date getDt_nasc() {
        return dt_nasc;
    }

    public boolean getIslogin() {
        return isLogin;
    }
}
