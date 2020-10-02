package webservicesspringbootrenan.demo.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import webservicesspringbootrenan.demo.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "renan", "renan@gmail.com", "96901491", "20030927");
        return ResponseEntity.ok().body(u);
    }

}
