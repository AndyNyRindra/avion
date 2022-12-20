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
@Table(name = "entretien")
public class Entretien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "idavion")
    private Integer idAvion;

    @Column(name = "dateentretien")
    private Date dateEntretion ;

    @Column(name = "nomentretien")
    private String nomentretien ;




}