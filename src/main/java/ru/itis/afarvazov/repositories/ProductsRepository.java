package ru.itis.afarvazov.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itis.afarvazov.models.Product;

import java.util.List;

public interface ProductsRepository extends JpaRepository<Product, Long> {

    List<Product> findByTitleIgnoreCase(String title);
    List<Product> findByCategory(Product.Category category);

}
