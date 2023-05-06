package br.com.alura.screenmatch.principal;

import java.util.ArrayList;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
		Filme outroFilme = new Filme("Vingadores", 2023);
		outroFilme.setDuracaoEmMinutos(120);
		/*  */
		
		
		Filme meuFilme = new Filme("Poderoso Chefão", 2012);
		meuFilme.setDuracaoEmMinutos(80);
		
		
		meuFilme.exibeFichaTecnica();
		meuFilme.avalia(10);
		meuFilme.avalia(9);
		meuFilme.avalia(9);
		meuFilme.avalia(10);
		
		Serie lost = new Serie("Lost", 2000);
		lost.exibeFichaTecnica();
		lost.setTemporadas(10);
		lost.setEpisodioPorTemporada(10);
		lost.setMinutosPorEpisodios(50);
		
		System.out.println("Duração para maratonar lost "+lost.getDuracaoEmMinutos());
		
		System.out.println(meuFilme.getDuracaoEmMinutos());
		
		System.out.println("O total de Avaliações é: " + meuFilme.getTotalDeAvaliacoes());
		
		System.out.println("a média de Avaliação é: " + meuFilme.pegaMedia());
		
		
		CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
		
		calculadora.inclui(meuFilme);
		calculadora.inclui(outroFilme);
		calculadora.inclui(lost);
		System.out.println("aqui calculadora o tempo de  filmes e series completas ou mais "+calculadora.getTempoTotal());
		
		FiltroRecomendacao filtro= new FiltroRecomendacao();
		filtro.filtra(meuFilme);
		filtro.filtra(lost);
		
		
		Episodio episodio = new Episodio();
		
		episodio.setNome("O amanhacer");
		episodio.setNumero(1);
		episodio.setSerie(lost);
		episodio.setTotalVisualizacoes(300);
		
		filtro.filtra(episodio);
		
		
		Filme filmeDoPaulo = new Filme("DogVille", 2003);
		filmeDoPaulo.avalia(10);
		filmeDoPaulo.setDuracaoEmMinutos(200);
		
		
		ArrayList<Filme> listaDeFilmes = new ArrayList<Filme>();
		
		listaDeFilmes.add(filmeDoPaulo);
		listaDeFilmes.add(meuFilme);
		listaDeFilmes.add(outroFilme);
		System.out.println(listaDeFilmes.size());
		System.out.println(listaDeFilmes.get(0).getNome());
		System.out.println(listaDeFilmes); //imprimindo uma array somente com nome do objeto, isto me volta um hexadecimal
		//o motivo de voltar um hexa decimal é pq o metodo toString(), fica invisivel em todos as classes, e isto é chamado se voce nao 
		// instanciar alguma variavel ou metodo.
		//porem se reescrever o metodo toString e colocar o que quer que devolva vai mudar aqui.
		// entaomd
		System.out.println(listaDeFilmes.toString()); // mesma coisa.
		System.out.println(listaDeFilmes.get(0).toString());
		System.out.println("voltando a lista com o to string reescrito." + listaDeFilmes.toString());
		
		
		

		
		
		
		}
}
