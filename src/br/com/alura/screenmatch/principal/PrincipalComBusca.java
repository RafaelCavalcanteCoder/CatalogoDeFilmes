package br.com.alura.screenmatch.principal;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

import br.com.alura.screenmatch.excecao.ErroDeCoversaoDeAnoException;
import br.com.alura.screenmatch.modelos.Titulo;
import br.com.alura.screenmatch.modelos.TituloOmdb;




public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
      
          List<Titulo> lista = new ArrayList<>();
          Scanner leitura = new Scanner(System.in);
         String busca = "";
         Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).setPrettyPrinting().create(); //deixa o formato Maiscu.

        while(busca!=("sair")){
          System.out.println("Digite um Filme para Busca: ");
          busca = leitura.nextLine();
          if(busca.equalsIgnoreCase("sair"))
          break;
         
        String endereco = "http://www.omdbapi.com/?t="+busca.replace(" ", "+")+"&apikey=fa9dca86";
      try{
        //fazendo a requisição.
        HttpClient client = HttpClient.newHttpClient(); 
        HttpRequest request = HttpRequest.newBuilder() 
        .uri(URI.create(endereco)).build();
   
     //objeter uma respostas atraves atravez do client. obter uma string do JSON representado fazendo o envio.
        HttpResponse<String> response = client.send(request, BodyHandlers.ofString()); 
        
        String json = response.body();
        System.out.println(json);


        TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
        System.out.println(meuTituloOmdb);

      
          Titulo meuTitulo = new Titulo(meuTituloOmdb);
          System.out.println("Titulo já convertido");
          System.out.println(meuTitulo);
          lista.add(meuTitulo);
        } catch(NumberFormatException e){ //o que eu preciso capturar.
          System.out.println("Aconteceu um erro"); 
       System.out.println(e.getMessage());

       } catch(IllegalArgumentException e){
        System.out.println("Algum erro de argumento na busca, verique o endereço.");
       } catch(ErroDeCoversaoDeAnoException e){
        System.out.println(e.getMessage());
       }
       

      
      FileWriter escrita = new FileWriter("filmes.json");

      escrita.write(gson.toJson(lista)); //transforma em json.
      escrita.close();
              System.out.println("aqui é pra ver se o prorama chegou ate aqui e finalizou e não parou.");

        
//Exceções podem ser previstas tratáveis e antecipadas.
//Erro não pode ser previsto nem tratato nem antecipados.

  } 
   }
  }
