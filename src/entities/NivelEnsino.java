package entities;

public enum NivelEnsino {

    ENSINO_FUND1("Ensino fundamental 1"),
    ENSINO_FUND2("Ensino fundamental 2"),
    ENSINO_MEDIO("Ensino médio");

    private String descricao;

    NivelEnsino(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao;
    }

    public static NivelEnsino fromDescricao(String descricao){
        for(NivelEnsino tipo : NivelEnsino.values()){
            if(tipo.getDescricao().equalsIgnoreCase(descricao)){
                return tipo;
            }
        }
        throw new IllegalArgumentException("Descrição inválida: " + descricao);
    }
}
