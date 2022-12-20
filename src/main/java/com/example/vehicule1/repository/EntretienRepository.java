package com.example.vehicule1.repository;


import com.example.vehicule1.model.Entretien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface EntretienRepository extends JpaRepository<Entretien,Integer> {
    List<Entretien> findByIdAvion(Integer id);
}
