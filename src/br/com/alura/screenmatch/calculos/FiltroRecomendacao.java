package br.com.alura.screenmatch.calculos;

public class FiltroRecomendacao {
     
	  public void filtra(Classificavel classificavel) { //quando eu chamar esse metodo e mandar filtrar alguem que implementou o Classificavel
        //faz a sua classficacao vai olhra as estrelas e vai imprimi as mensagens
        if(classificavel.getClassificacao() >=4)
            System.out.println(classificavel +" Está entre os preferidos do momento");
        else if(classificavel.getClassificacao() >=2)  
            System.out.println(classificavel+ "Muito bem avaliados no momento");
        else
            System.out.println(classificavel +"Deixe para assistir em outro momento");
    }
}
