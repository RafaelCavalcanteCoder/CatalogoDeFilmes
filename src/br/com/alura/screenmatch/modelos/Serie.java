package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Serie extends Titulo implements Classificavel {
    public Serie(String nome, int anoDeLancamento) {
		super(nome, anoDeLancamento);
	
	}

	private int temporadas;
	private boolean ativa;
	private int episodioPorTemporada;
	private int minutosPorEpisodios;
	
	
	int getTemporadas() {
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
	public int getEpisodioPorTemporada() {
		return episodioPorTemporada;
	}
	public void setEpisodioPorTemporada(int episodioPorTemporada) {
		this.episodioPorTemporada = episodioPorTemporada;
	}
	public int getMinutosPorEpisodios() {
		return minutosPorEpisodios;
	}
	public void setMinutosPorEpisodios(int minutosPorEpisodios) {
		this.minutosPorEpisodios = minutosPorEpisodios;
	}
	 //possibilita a sobrescrita do metodo que esta no Titulo
	public int getDuracaoEmMinutos() {
		 return temporadas*episodioPorTemporada*minutosPorEpisodios;
	}
	
	@Override
	public int getClassificacao() {
		return (int) pegaMedia()/3;
	}

	@Override
	public String toString() {
		return "Série: " + this.getNome() + "(" +this.getAnoDeLancamento() + ")";
	}
}
