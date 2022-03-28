package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class UserEntity {
    @Id
    @Column(name = "user_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    private Long id;

    @Getter@Setter
    private String name;
    @Getter@Setter
    private String email;
    @Getter@Setter
    private String pass;
    @Getter@Setter
    private String user_type;
}
