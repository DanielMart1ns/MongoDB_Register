package br.com.ebac.ebac_mongoDB.modelo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//Nosso modelo
@Document("Jogo") //Nome do documento que iremos criar
public class Jogo {
    @Id
    private String id;
    private String nome;
    private String distribuidora;
    private String desenvolvedor;
    private String plataforma;

    public Jogo(String nome, String plataforma, String desenvolvedor, String distribuidora) {
        this.nome = nome;
        this.plataforma = plataforma;
        this.desenvolvedor = desenvolvedor;
        this.distribuidora = distribuidora;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
