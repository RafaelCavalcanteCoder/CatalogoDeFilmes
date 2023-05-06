package br.com.alura.screenmatch.modelos;


import br.com.alura.screenmatch.excecao.ErroDeCoversaoDeAnoException;

public class Titulo implements Comparable<Titulo> {
    public Titulo(String nome, int anoDeLancamento) {
		this.nome = nome;
		this.anoDeLancamento = anoDeLancamento;
	}
	
	public Titulo(TituloOmdb meuTituloOmdb) {
		this.nome=meuTituloOmdb.title();
		if(meuTituloOmdb.year().length()>4){
			throw new ErroDeCoversaoDeAnoException("Não consegui converter o ano porque tem amis de 4 caracteres.");
		}
		this.anoDeLancamento=Integer.valueOf(meuTituloOmdb.year()); //se vira e me volta transforme em int.
		this.duracaoEmMinutos = Integer.valueOf(meuTituloOmdb.runtime().substring(0, 2)); //posição 0 a 2;


    }

	private String nome;
	private int anoDeLancamento;
	private boolean incluidoNoPlano;
	private double somaDasAvaliacoes;
	private int totalDeAvaliacoes;
	private int duracaoEmMinutos;
	
	
	public void setincluidoNoPlano(boolean incluidoNoPlano) {
		this.incluidoNoPlano=incluidoNoPlano;
	}
	
	public void setDuracaoEmMinutos(int duracaoEmMinutos) {
		this.duracaoEmMinutos=duracaoEmMinutos;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getAnoDeLancamento() {
		return anoDeLancamento;
	}

		public boolean isIncluidoNoPlano() {
		return incluidoNoPlano;
	}
	
	public int getTotalDeAvaliacoes() {
		return totalDeAvaliacoes;
	}
	
	public int getDuracaoEmMinutos() {
		return duracaoEmMinutos;
	}
		
	public void exibeFichaTecnica() {
		System.out.println("Nome do filme: " + nome);
		System.out.println("Ano de lançamento: "+ getAnoDeLancamento());
	}
	
	public void avalia(double nota) {
		somaDasAvaliacoes+= nota;
		totalDeAvaliacoes++;
	}
	
	public double pegaMedia() {
		return somaDasAvaliacoes/totalDeAvaliacoes;
	}

	@Override
	public int compareTo(Titulo outroTitulo) { //quero o nome que chamo comparado com o que vai no parametro. e ver a ordem das String alfabeticas
		return this.getNome().compareTo(outroTitulo.getNome()); //compara o essa String com outra String. compareTo. alfabeticamente
	
	}

	@Override
	public String toString(){
		return "( Nome= " +nome+" Ano de Lançamento= " + anoDeLancamento + " Duração: "+duracaoEmMinutos+ " )";
	}

	


	
}
