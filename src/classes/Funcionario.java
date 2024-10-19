package classes;

import java.sql.Date;

public abstract class Funcionario extends Usuario {
    private int cargaHoraria;
    private double salario;
    private int entradaSaida;

    public Funcionario(int cargaHoraria, double salario, String nome, Integer idade, String email, String senha, String cpf, Date dt_nasc) {
        super(nome, idade, email, senha, cpf, dt_nasc);
        this.cargaHoraria = cargaHoraria;
        this.salario = salario;
    }

    public void baterPonto() {
        entradaSaida++;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public double getSalario() {
        return salario;
    }

    public int getEntradaSaida() {
        return entradaSaida;
    }
}
