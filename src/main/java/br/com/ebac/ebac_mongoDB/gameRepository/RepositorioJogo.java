package br.com.ebac.ebac_mongoDB.gameRepository;

import br.com.ebac.ebac_mongoDB.modelo.Jogo;
import org.springframework.data.mongodb.repository.MongoRepository;

//Metodo de DAO do MongoDB contendo varias funcionalidades para interacao com o banco
public interface RepositorioJogo extends MongoRepository<Jogo, String> {
    long count();
}
