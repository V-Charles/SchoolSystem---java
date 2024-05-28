package entities;

import java.util.Date;

public class Responsavel extends Pessoa{

    private String relacaoComAluno;

    public Responsavel(String nome, String cpf, Date dataNasc, Endereco endereco, Contato contato, String relacaoComAluno) {
        super(nome, cpf, dataNasc, endereco, contato);
        this.relacaoComAluno = relacaoComAluno;
    }

    public String getRelacaoComAluno() {
        return relacaoComAluno;
    }

    public void setRelacaoComAluno(String relacaoComAluno) {
        this.relacaoComAluno = relacaoComAluno;
    }
}
