package br.com.alura.screenmatch.principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

public class PrincipalComLista {
    public static void main(String[] args) {
		Filme outroFilme = new Filme("Vingadores", 2023);
		outroFilme.avalia(9);
		Filme meuFilme = new Filme("Poderoso Chefão", 2012);
		meuFilme.avalia(10);
		Filme filmeDoPaulo = new Filme("Dogville", 2003);
		filmeDoPaulo.avalia(8);
		Serie lost = new Serie("Lost", 2000);
		lost.avalia(9);
		
		List<Titulo> lista = new LinkedList<>(); //pode da new pra uma list olha ali a List, pode ser uma ArrayList, uma LinkedList uma forma genetica.
		//parametrizar a lista. vai guardar Titulo.
		lista.add(outroFilme); 
		lista.add(meuFilme);
		lista.add(filmeDoPaulo);
		lista.add(lost);
		
		//for(Titulo listas:lista) {
		//se ele for instanceof se lista é Filme o que tem em lista é filme mostra.  
		//	if(listas instanceof Filme filme && filme.getClassificacao()>2) {
		 // INSTANCEOF se ele é o filme ai sim eu vou mostrar a classific.
		//	System.out.println(filme.getClassificacao());

		List <String> buscaPorArtista = new ArrayList<>();
		
		buscaPorArtista.add("Adam Stancler"); 
		buscaPorArtista.add("Rafael");
		buscaPorArtista.add("Joao");		
		buscaPorArtista.add("Guilherme");
		
		System.out.println("Lista BuscaPorArtista "+ buscaPorArtista);
		
		Collections.sort(buscaPorArtista); //já deixa em ordem alfabetica. //aqui não precisa ser reescrito o metodo compareTo
		//pq só tem String, então ele consegue comparar uma String com outra, e colocar em ordem afalbetica.
		System.out.println(buscaPorArtista);
		
		//*Porem aqui ele não consegue pois em lista tem, Objetos que tem String, int, double etc, dai ele não sabe qual vai colocar em ordem
		Collections.sort(lista); //o Collections.sort(x) o metodo compareTo() tem que ser reescrito, pq ele só compara objetos que saibam se comparar 
		//um com o outro. precisa se comparar um com o outro igual a lista de String buscaPorArtista , int sabe, numeros. sabe. mas
		//tipos são diversos tipos.
			System.out.println(lista);
			
			//como que eu quero comparar,  O que vc quer comparar do Titulo, ? getAnoDeLancamento.
			//forma de sintaxe para comparar pelo ano de lancamento, avaliações, nome etc.
			lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento)); //passando para que todo titulo pega o ano de lancamento como criterio de comparacao
			lista.sort(Comparator.comparing(Titulo::getTotalDeAvaliacoes));
			//.sort SORT é para ordenar em ordem crescente. alfabetica.
			System.out.println(lista);

		}
}
