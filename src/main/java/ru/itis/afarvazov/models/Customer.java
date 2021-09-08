package ru.itis.afarvazov.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Customer extends User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String login;
    private String hashPassword;

    @OneToMany(mappedBy = "owner")
    @JsonBackReference
    private List<Cart> carts;


    @Enumerated(value = EnumType.STRING)
    private Role role;

}
