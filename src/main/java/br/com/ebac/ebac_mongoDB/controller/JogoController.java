package br.com.ebac.ebac_mongoDB.controller;

import br.com.ebac.ebac_mongoDB.modelo.Jogo;
import br.com.ebac.ebac_mongoDB.service.ServicoJogo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/jogos")
public class JogoController {

    @Autowired
    private ServicoJogo servicoJogo;

    @PostMapping
    public Jogo criarJogo(@RequestBody Jogo jogo){
        return servicoJogo.criarJogo(jogo);
    }

    @GetMapping("/count")
    public String quantidadeJogos(){
        return "Jogos cadastrados: " + servicoJogo.quantidadeJogos();
    }
}
