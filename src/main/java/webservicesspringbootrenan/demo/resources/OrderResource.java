package webservicesspringbootrenan.demo.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import webservicesspringbootrenan.demo.entities.Order;
import webservicesspringbootrenan.demo.services.OrderService;

import java.util.List;

@RestController
@RequestMapping(value = "/order")
public class OrderResource {
    @Autowired
    private OrderService service;


    @GetMapping
    // essa anotation corresponde  a um get do http-> signica que ela ira retornar esse metodo quando acessar o /users
    public ResponseEntity<List<Order>> findAll() {
        List<Order> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Order> findByid(@PathVariable Long id) {
        Order obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

}
