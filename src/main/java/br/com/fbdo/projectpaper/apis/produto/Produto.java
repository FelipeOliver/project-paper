package br.com.fbdo.projectpaper.apis.produto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Produto {

    private Long id;
    private String descricao;
    private Double valor;

}
