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
@Table(name = "societe")
public class Societe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;


    @Column(name = "email")
    private String  email ;

    @Column(name = "pwd")
    private String  pwd;
}
