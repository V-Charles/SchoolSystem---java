package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Coordenacao extends Funcionario{

    private String setorDeResponsabilidade;

    public Coordenacao(String nome, String cpf, Date dataNasc, Endereco endereco, Contato contato, String setor,
            Double salario, Periodo turno, String setorDeResponsabilidade) {
        super(nome, cpf, dataNasc, endereco, contato, setor, salario, turno);
        this.setorDeResponsabilidade = setorDeResponsabilidade;
    }

    public String getSetorDeResponsabilidade() {
        return setorDeResponsabilidade;
    }

    public void setSetorDeResponsabilidade(String setorDeResponsabilidade) {
        this.setorDeResponsabilidade = setorDeResponsabilidade;
    }

    private List<Aluno> alunos = new ArrayList<>();

    public void matricularAluno(String nomeAluno, String cpfAluno, Date dataNascAluno, Endereco enderecoAluno, Contato contatoAluno, String matriculaAluno, NivelEnsino ensino, Date anoDeIngressoAluno, Responsavel responsavel ,String nomeResp, String cpfResp, Date dataNascResp, Endereco enderecoResp, Contato contatoResp, String relacaoComAluno){
        
        Aluno novoAluno = new Aluno(nomeAluno, cpfAluno, dataNascAluno, enderecoAluno, contatoAluno, matriculaAluno, ensino, anoDeIngressoAluno, responsavel);
        
        Responsavel novoResponsavel = new Responsavel(nomeResp, cpfResp, dataNascResp, enderecoResp, contatoResp, relacaoComAluno);

       novoAluno.setResponsavel(novoResponsavel);

        this.alunos.add(novoAluno);
    }
}
