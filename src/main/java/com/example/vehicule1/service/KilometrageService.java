package com.example.vehicule1.service;

import com.example.vehicule1.model.Kilometrage;
import com.example.vehicule1.repository.KilometrageRepository;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class KilometrageService {
    private final KilometrageRepository kilometrageRepository;


    public KilometrageService(KilometrageRepository repo ) {
        this.kilometrageRepository = repo;

    }
    public List<Kilometrage> findAllKilometrage() {
        return kilometrageRepository.findAll();
    }
    public Kilometrage findById(Integer id) {
        return kilometrageRepository.findById(id).get();
    }
    public Kilometrage saveKilometrage(Kilometrage carre) {
        return kilometrageRepository.save(carre);
    }
}
