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
@Table(name = "assurance")
public class Assurance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "idavion")
    private Integer idAvion;

    @Column(name = "datecreation")
    private Date dateCreation ;

    @Column(name = "dateexpiration")
    private Date dateExpiration ;

    @Column(name = "nomassurance")
    private String nomAssurance;

    @Column(name = "prix")
    private double prix;


}
