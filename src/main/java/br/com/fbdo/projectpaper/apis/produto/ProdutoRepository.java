package br.com.fbdo.projectpaper.apis.produto;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

public class ProdutoRepository {

    public final static List<Produto> produtos  = new ArrayList<Produto>() {
        {
            add(Produto.builder().id(1L).descricao("papel").valor(10.0).build());
        }
    };
}