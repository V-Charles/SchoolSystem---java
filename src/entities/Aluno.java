package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Aluno extends Pessoa{

    private String matricula;
    private String curso;
    private Date anoDeIngresso;
    private List<Nota> nota = new ArrayList<>();

    public Aluno(String nome, String cpf, Date dataNasc, Endereco endereco, Contato contato, String matricula, String curso, Date anoDeIngresso) {
        super(nome, cpf, dataNasc, endereco, contato);
        this.matricula = matricula;
        this.curso = curso;
        this.anoDeIngresso = anoDeIngresso;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Date getAnoDeIngresso() {
        return anoDeIngresso;
    }

    public void setAnoDeIngresso(Date anoDeIngresso) {
        this.anoDeIngresso = anoDeIngresso;
    }

    public List<Nota> geNotas(){
        return nota;
    }

    public void addNota(Nota nota){
        this.nota.add(nota);
    }
}
