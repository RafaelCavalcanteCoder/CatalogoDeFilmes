package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretor;
	private int totalVisualizacoes;
	
	
	public Filme(String nome, int anoDeLancamento) {
		super(nome, anoDeLancamento);
	}
	
	public String getDiretor() {
		return diretor;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}

	

	public int getTotalVisualizacoes() {
		return totalVisualizacoes;
	}

	public void setTotalVisualizacoes(int totalVisualizacoes) {
		this.totalVisualizacoes = totalVisualizacoes;
	}
	
	@Override
	public int getClassificacao() {
		return (int) pegaMedia()/2;
	}
	
	@Override
	public String toString() {
		return "Filme: "+ this.getNome() + " Ano Lançamento ( " + this.getAnoDeLancamento() + ")"; 
}

}
