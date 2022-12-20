package com.example.vehicule1.model;


import javax.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Data
@Getter
@Setter
@Entity
@Table(name = "avion")
public class Avion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;


    @Column(name = "numero")
    private String numero ;

    @Column(name = "nom")
    private String nom;

    @Column(name = "societeid")
    private Integer societeId;

    @OneToMany(mappedBy = "id")
    List<Kilometrage> kilometrage;

    @OneToMany(mappedBy = "id")
    List<Assurance> assurance;


}
