package dio_desafio_dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
   
    private int cargaHoraria;
    private LocalDate data;

    @Override
    public double calcularXp() {        
        return XP_PADRAO + 20d;
    }

    public Mentoria() {

    }

    public int getCargaHoraria() {
        return this.cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public LocalDate getData() {
        return this.data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "{" +
            " titulo='" + getTitulo() + "'" +
            ", descricao='" + getDescricao() + "'" +
            ", cargaHoraria='" + getCargaHoraria() + "'" +
            ", data='" + getData() + "'" +
            "}";
    }
   
}
