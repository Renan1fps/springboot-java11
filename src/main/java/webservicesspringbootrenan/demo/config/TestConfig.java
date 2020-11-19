package webservicesspringbootrenan.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import webservicesspringbootrenan.demo.entities.Category;
import webservicesspringbootrenan.demo.entities.Order;
import webservicesspringbootrenan.demo.entities.User;
import webservicesspringbootrenan.demo.entities.enums.OrderStatus;
import webservicesspringbootrenan.demo.repositories.CategoryRepository;
import webservicesspringbootrenan.demo.repositories.OrderRepository;
import webservicesspringbootrenan.demo.repositories.UserRepository;

import java.time.Instant;

import static java.util.Arrays.asList;

@Configuration // serve para falar ao spring que é uma classe de configuraçao
@Profile("test")//para dizer que essa classe é expecifica do perfil de teste

public class TestConfig implements CommandLineRunner {//o command é para minha aplicaçao rodar no perfil de teste

    @Autowired//uso em injeçao de dependencia para o spring saber que a classe tem uma dependencia do UserRepository
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private CategoryRepository categoryRepository;


    @Override
    public void run(String... args) throws Exception {

        Category cat1 = new Category(null, "Electronics");
        Category cat2 = new Category(null, "Books");
        Category cat3 = new Category(null, "Computers");
        categoryRepository.saveAll(asList(cat1, cat2, cat3));


        User user1 = new User(null, "renan", "Renan@gmail.com", "996901491", "20030927");
        User user2 = new User(null, "Emerson", "Emerson@gmail.com", "946578925", "475869");
        userRepository.saveAll(asList(user1, user2));

        Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, user1);
        Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.SHIPPED, user2);
        Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.SHIPPED, user1);
        orderRepository.saveAll(asList(o1, o2, o3));
    }
}
