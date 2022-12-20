package com.example.vehicule1.repository;

import com.example.vehicule1.model.Kilometrage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface KilometrageRepository extends JpaRepository<Kilometrage,Integer> {
    List<Kilometrage> findByIdAvion(Integer id);
}