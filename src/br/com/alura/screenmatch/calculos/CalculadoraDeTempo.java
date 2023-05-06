package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
	private int tempoTotal;

	public void inclui(Titulo  titulo) { //todo filme é um titulo, toda serie é um titulo antes cabe os 2 tipos de variaveis do tipo serie filme.
		System.out.println("Adicionando tempo em minutos do: "+ titulo);
		tempoTotal+=titulo.getDuracaoEmMinutos(); //aqui entra o polimofismo, pois quem eu chamar chama o metodo de acordo com a classe passada.
	}
	
	public int getTempoTotal() {
		return tempoTotal;
	}
	/*
	 * public void inclui(Filme filme) { //vai pegar o filme como parametro, e do
	 * filme vai pegar o tempo que ja tinha antes se houvesse algum filme
	 * this.tempoTotal= tempoTotal +filme.getDuracaoEmMinutos();// e vai somar com o
	 * duracao do filme passado como parametro. }
	 * 
	 * public void inclui(Serie serie) { //mesma coisa , mas a serie é a serie
	 * inteira duracao inteira. this.tempoTotal= tempoTotal
	 * +serie.getDuracaoEmMinutos(); }
	 */

}
