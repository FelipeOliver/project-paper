package br.com.fbdo.projectpaper.apis.produto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping("/produtos")
public class ProdutoApi {

    private Logger logger = Logger.getLogger("[Produtos]");

    @GetMapping("/all")
    public List<Produto> getAll() {
        this.logger.info("Teste");
        return ProdutoRepository.produtos;
    }
}
