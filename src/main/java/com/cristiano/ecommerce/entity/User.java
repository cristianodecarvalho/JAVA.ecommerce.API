package com.cristiano.ecommerce.entity;

import com.cristiano.ecommerce.enums.UserRole;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "t_users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String password;
    private String name;
    private UserRole role;

//    @Lob
//    @Column(columnDefinition = "bytea")
//    private byte[] img;

}
