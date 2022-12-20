package com.example.vehicule1.model;

import javax.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import  java.sql.Date;

@Data
@Getter
@Setter
@Entity
@Table(name = "kilometrage")
public class Kilometrage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;


    @Column(name = "dates")
    private Date dates ;

    @Column(name = "debutkm")
    private Integer debutKm;

    @Column(name = "finkm")
    private Integer finKm;

    @Column(name = "idavion")
    private Integer idAvion;
}
