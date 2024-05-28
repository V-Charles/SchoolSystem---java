package entities;

public class Contato {

    private String celular;
    private String telFixo;
    private String email;

    public Contato(String celular, String telFixo, String email) {
        this.celular = celular;
        this.telFixo = telFixo;
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getTelFixo() {
        return telFixo;
    }

    public void setTelFixo(String telFixo) {
        this.telFixo = telFixo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    } 
}
