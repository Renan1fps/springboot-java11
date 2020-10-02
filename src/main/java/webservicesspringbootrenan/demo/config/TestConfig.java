package webservicesspringbootrenan.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import webservicesspringbootrenan.demo.entities.User;
import webservicesspringbootrenan.demo.repositories.UserRepository;

import static java.util.Arrays.asList;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User user1= new User(null,"renan","Renan@gmail.com","996901491","20030927");
        User user2= new User(null,"Emerson","Emerson@gmail.com","946578925","475869");
        userRepository.saveAll(asList(user1,user2));
    }
}
