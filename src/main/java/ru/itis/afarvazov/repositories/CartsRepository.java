package ru.itis.afarvazov.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itis.afarvazov.models.Cart;
import ru.itis.afarvazov.models.Customer;

import java.util.List;

public interface CartsRepository extends JpaRepository<Cart, Long> {

    List<Cart> findByOwnerAndActive(Customer customer, Boolean isActive);

}
