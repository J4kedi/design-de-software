package classes;

import java.sql.Date;

public class Gerente extends Funcionario {
    public Gerente(int cargaHoraria, double salario, String nome, Integer idade, String email, String senha, String cpf, Date dt_nasc) {
        super(cargaHoraria, salario, nome, idade, email, senha, cpf, dt_nasc);
    }

    public void cadastrarFuncionario(Funcionario funcionario) {
        // Implementar a lógica para cadastrar um novo funcionário
    }

    public void cadastrarIngrediente(Ingrediente ingrediente) {
        // Implementar a lógica para cadastrar um novo ingrediente
    }
}
