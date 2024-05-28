package entities;

import java.util.Date;

public class Nota {

    private Double valor;
    private String tipo;
    private Date data;
    private String periodo;
    
    public Nota(Double valor, String tipo, Date data, String periodo) {
        this.valor = valor;
        this.tipo = tipo;
        this.data = data;
        this.periodo = periodo;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }
}
