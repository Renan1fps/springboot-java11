package webservicesspringbootrenan.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import webservicesspringbootrenan.demo.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
