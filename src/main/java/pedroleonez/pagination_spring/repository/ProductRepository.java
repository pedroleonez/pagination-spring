package pedroleonez.pagination_spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pedroleonez.pagination_spring.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
    
}
