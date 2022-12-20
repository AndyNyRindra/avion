package com.example.vehicule1.service;

import com.example.vehicule1.model.Societe;
import com.example.vehicule1.repository.SocieteRepository;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class SocieteService {
    private final SocieteRepository societeRepository;


    public SocieteService(SocieteRepository repo ) {
        this.societeRepository = repo;

    }
    public List<Societe> findAllSociete() {
        return societeRepository.findAll();
    }
    public Societe findById(Integer id) {
        return societeRepository.findById(id).get();
    }
    public Societe saveSociete(Societe carre) {
        return societeRepository.save(carre);
    }
}
