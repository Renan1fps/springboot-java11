package webservicesspringbootrenan.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import webservicesspringbootrenan.demo.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
