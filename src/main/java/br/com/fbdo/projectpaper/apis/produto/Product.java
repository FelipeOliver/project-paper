package br.com.fbdo.projectpaper.apis.produto;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data @Builder @Entity
public class Product {

    @Id
    @GeneratedValue
    private Long id;
    private String descricao;
    private Double valor;

}
