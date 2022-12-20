package com.example.vehicule1.repository;

import com.example.vehicule1.model.Avion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface AvionRepository extends JpaRepository<Avion,Integer> {

}
