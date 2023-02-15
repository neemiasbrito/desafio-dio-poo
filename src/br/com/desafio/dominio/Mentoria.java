package br.com.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
    // #region ATRIBUTO
    private LocalDate date;
    // #endregion

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    // #region Construtor
    public Mentoria() {
    }
    // #endregion

    // #region Metodo Get e Set

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
    // #endregion

    // #region Metodo toString
    @Override
    public String toString() {
        return "Mentoria [titulo=" + getTitulo() +
                ", descricao=" + getDescricao() +
                ", date=" + date + "]";
    }
    // #endregion

}
