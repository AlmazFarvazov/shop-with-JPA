package ru.itis.afarvazov.models;

import lombok.*;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class ShopEmployee extends User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String login;
    private String firstName;
    private String lastName;
    private String hashPassword;


    @Enumerated(value = EnumType.STRING)
    private Role role;
}
