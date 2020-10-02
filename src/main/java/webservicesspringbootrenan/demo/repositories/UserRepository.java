package webservicesspringbootrenan.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import webservicesspringbootrenan.demo.entities.User;

public interface UserRepository extends JpaRepository<User,Long> {
}
