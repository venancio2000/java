package br.com.alura.scrematch.modelos;

public class Serie extends Titulo {
    private int temporadas;
    private boolean ativa;
    private int episodiosPorTemporada;
    private int minutosPorEpsodios;

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getMinutosPorEpsodios() {
        return minutosPorEpsodios;
    }

    public void setMinutosPorEpsodios(int minutosPorEpsodios) {
        this.minutosPorEpsodios = minutosPorEpsodios;
    }

    @Override
    public int getDuracaoEmminutos() {
        return temporadas * episodiosPorTemporada * minutosPorEpsodios;
    }
}
