package com.example.vehicule1.service;

import com.example.vehicule1.model.Entretien;
import com.example.vehicule1.repository.EntretienRepository;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class EntretienService {
    private final EntretienRepository entretienRepository;


    public EntretienService(EntretienRepository repo ) {
        this.entretienRepository = repo;

    }
    public List<Entretien> findAllEntretien() {
        return entretienRepository.findAll();
    }
    public Entretien findById(Integer id) {
        return entretienRepository.findById(id).get();
    }
    public Entretien saveEntretien(Entretien carre) {
        return entretienRepository.save(carre);
    }
}
