package com.example.vehicule1.repository;

import com.example.vehicule1.model.Societe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface SocieteRepository extends JpaRepository<Societe,Integer> {

}
