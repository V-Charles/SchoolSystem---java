package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Aluno extends Pessoa{

    private String matricula;
    private NivelEnsino ensino;
    private Date anoDeIngresso;
    private Responsavel responsavel;

    private List<Nota> nota = new ArrayList<>();

    public Aluno(String nome, String cpf, Date dataNasc, Endereco endereco, Contato contato, String matricula, NivelEnsino ensino, Date anoDeIngresso, Responsavel responsavel) {
        super(nome, cpf, dataNasc, endereco, contato);
        this.matricula = matricula;
        this.ensino = ensino;
        this.anoDeIngresso = anoDeIngresso;
        this.responsavel = responsavel;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public NivelEnsino getEnsino() {
        return ensino;
    }

    public void setEnsino(NivelEnsino ensino) {
        this.ensino = ensino;
    }

    public Date getAnoDeIngresso() {
        return anoDeIngresso;
    }

    public void setAnoDeIngresso(Date anoDeIngresso) {
        this.anoDeIngresso = anoDeIngresso;
    }

    public List<Nota> geNota(){
        return nota;
    }

    public void addNota(Nota nota){
        this.nota.add(nota);
    }

    public Responsavel getResponsavel(){
        return this.responsavel;
    }

    public void setResponsavel(Responsavel responsavel) {
        this.responsavel = responsavel;
    }
}
