package dio_desafio_dominio;

public abstract class Conteudo {
    
    protected static final double XP_PADRAO = 10d;

    private String titulo;
    private String descricao;

    public abstract double calcularXp();

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String tritulo) {
        this.titulo = tritulo;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }    

}
