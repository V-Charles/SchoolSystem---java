package entities;

import java.util.Date;

public class Funcionario extends Pessoa{

    private String setor;
    private Double salario;
    private Periodo turno;
    
    public Funcionario(String nome, String cpf, Date dataNasc, Endereco endereco, Contato contato, String setor,
            Double salario, Periodo turno) {
        super(nome, cpf, dataNasc, endereco, contato);
        this.setor = setor;
        this.salario = salario;
        this.turno = turno;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Periodo getTurno() {
        return turno;
    }

    public void setTurno(Periodo turno) {
        this.turno = turno;
    }
}
