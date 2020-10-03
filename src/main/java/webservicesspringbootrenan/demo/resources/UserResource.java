package webservicesspringbootrenan.demo.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import webservicesspringbootrenan.demo.entities.User;
import webservicesspringbootrenan.demo.services.Userservice;

import java.util.List;

@RestController//para dizer que esse é um controller e irá me retornar
@RequestMapping(value = "/users")//para acessar meu endpoint esse é o caminho quando fizer uma requisiçao de usuarios
public class UserResource {
    @Autowired
    private Userservice service;


    @GetMapping
    // essa anotation corresponde  a um get do http-> signica que ela ira retornar esse metodo quando acessar o /users
    public ResponseEntity<List<User>> findAll() {
        List<User> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findByid(@PathVariable Long id) {
        User obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

}
