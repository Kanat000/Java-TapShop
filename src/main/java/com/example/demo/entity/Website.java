package com.example.demo.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "websites")
public class Website {
    @Id
    @Column(name = "website_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    private Long id;
    @Getter@Setter
    private String name;
    @Getter@Setter
    private String logo_url;
    @Getter@Setter
    private String folder;
}
