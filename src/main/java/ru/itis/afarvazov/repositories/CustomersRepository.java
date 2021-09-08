package ru.itis.afarvazov.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itis.afarvazov.models.Customer;

import java.util.Optional;

public interface CustomersRepository extends JpaRepository<Customer, Long> {

    Optional<Customer> findByEmail(String email);
    Optional<Customer> findByLogin(String login);

}
