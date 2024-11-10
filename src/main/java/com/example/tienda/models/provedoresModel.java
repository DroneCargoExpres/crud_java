package com.example.tienda.models;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name="provedores")
public class provedoresModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String firstName;

    @Column
    private String LastName;

    @Column(name="email", unique=true, nullable=false)
    private String email;


}
