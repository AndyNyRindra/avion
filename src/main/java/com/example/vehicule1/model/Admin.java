package com.example.vehicule1.model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Table(name = "admin")
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "nomadmin")
    String nomadmin;

    @Column(name = "mdpadmin")
    String mdpadmin;

    @Column(name = "email")
    String email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomadmin() {
        return nomadmin;
    }

    public void setNomadmin(String nomadmin) {
        this.nomadmin = nomadmin;
    }

    public String getMdpadmin() {
        return mdpadmin;
    }

    public void setMdpadmin(String mdpadmin) {
        this.mdpadmin = mdpadmin;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
