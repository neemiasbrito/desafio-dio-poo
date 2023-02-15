package br.com.desafio.dominio;

public class Curso extends Conteudo {
    // #region Metodo Atributo

    private int cargaHorario;
    // #endregion

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHorario;
    }

    // #region Construtor
    public Curso() {
    }
    // #endregion

    // #region Metodo Gete Set

    public int getCargaHorario() {
        return cargaHorario;
    }

    public void setCargaHorario(int cargaHorario) {
        this.cargaHorario = cargaHorario;
    }
    // #endregion

    // #region Metodo toString
    @Override
    public String toString() {
        return "Curso [titulo=" + getTitulo() +
                ", descricao=" + getDescricao()
                + ", cargaHorario=" + cargaHorario +
                "]";
    }
    // #endregion

}
