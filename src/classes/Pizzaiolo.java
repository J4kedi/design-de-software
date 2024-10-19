package classes;

import java.sql.Date;

public class Pizzaiolo extends Usuario{
    public Pizzaiolo(String nome, Integer idade, String email, String senha, String cpf, Date dt_nasc) {
        super(nome, idade, email, senha, cpf, dt_nasc);
    }

    public void prepararPizza() {
        System.out.println("Preparando Pizza");
    }
}
