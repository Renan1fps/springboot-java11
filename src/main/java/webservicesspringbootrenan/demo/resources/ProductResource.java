package webservicesspringbootrenan.demo.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import webservicesspringbootrenan.demo.entities.Product;
import webservicesspringbootrenan.demo.services.ProductService;

import java.util.List;

@RestController//para dizer que esse é um controller e irá me retornar
@RequestMapping(value = "/products")//para acessar meu endpoint esse é o caminho quando fizer uma requisiçao de usuarios
public class ProductResource {

    @Autowired
    private ProductService productService;

    @GetMapping
    // essa anotation corresponde  a um get do http-> signica que ela ira retornar esse metodo quando acessar o /Products
    public ResponseEntity<List<Product>> findAll() {
        List<Product> list = productService.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Product> findById(@PathVariable Long id) {
      Product product= productService.findById(id);
        return ResponseEntity.ok().body(product);
    }

}
