package br.com.fbdo.projectpaper.apis.produto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping("/produtos")
public class ProductApi {

    private Logger logger = Logger.getLogger(String.valueOf(this.getClass()));

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/all")
    public List<Product> getAll() {
        this.logger.info("Teste");
        return (List<Product>) productRepository.findAll();
    }
}
