package br.com.ebac.ebac_mongoDB.service;

import br.com.ebac.ebac_mongoDB.gameRepository.RepositorioJogo;
import br.com.ebac.ebac_mongoDB.modelo.Jogo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Component;

//Nosso servico para os jogos, usando os métodos do Mongorepository que criamos
@Component
@EnableMongoRepositories(basePackageClasses = RepositorioJogo.class)
public class ServicoJogo {

    @Autowired
    private RepositorioJogo repositorioJogo;

    //Metodo de insercao de jogo no banco de dados
    public Jogo criarJogo(Jogo jogo){
        return repositorioJogo.insert(jogo);
    }

    //Metodo que retorna a quantidade de jogos no database
    public Long quantidadeJogos(){
        return repositorioJogo.count();
    }
}
