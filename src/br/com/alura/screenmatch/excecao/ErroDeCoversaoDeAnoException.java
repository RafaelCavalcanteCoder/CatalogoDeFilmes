package br.com.alura.screenmatch.excecao;

public class ErroDeCoversaoDeAnoException extends RuntimeException {
   String mensagem;
    public ErroDeCoversaoDeAnoException(String mensagem){
    this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
} 
