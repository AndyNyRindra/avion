package com.example.vehicule1.service;


import com.example.vehicule1.repository.*;
import com.example.vehicule1.model.*;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class AvionService {
    private final AvionRepository avionRepository;
    private final AssuranceRepository assuranceRepository;
    private final KilometrageRepository kilometrageRepository;





    public AvionService(AvionRepository repo, AssuranceRepository assuranceRepository, KilometrageRepository kilometrageRepository) {
        this.avionRepository = repo;

        this.assuranceRepository = assuranceRepository;
        this.kilometrageRepository = kilometrageRepository;
    }
    public List<Avion> findAllAvion() {
        return avionRepository.findAll();
    }
    public Avion findById(Integer id) {
        return avionRepository.findById(id).get();
    }
    public Avion saveAvion(Avion carre) {
        return avionRepository.save(carre);
    }

    public void setKilometrage(Avion v){
        v.setKilometrage(kilometrageRepository.findByIdAvion(v.getId()));
    }
    public  void setAssurance(Avion v){
        v.setAssurance(assuranceRepository.findByIdAvion(v.getId()));
    }

}
