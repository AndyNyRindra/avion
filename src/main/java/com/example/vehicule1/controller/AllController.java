package com.example.vehicule1.controller;


import com.example.vehicule1.model.*;
import com.example.vehicule1.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import  java.util.List;

@CrossOrigin
@RestController
public class AllController {
    @Autowired
    KilometrageService kilometrageService;

    @Autowired
    EntretienService entretienService;

    @Autowired
    AssuranceService assuranceService;

    @Autowired
    AvionService avionService;

    @Autowired
    SocieteService societeService;


    @GetMapping("/avion")
    private List<Avion> getAllAvion(){
        return  avionService.findAllAvion();
    }


    @GetMapping("/avion/{id}")
    private Avion getVehicule(@PathVariable("id") Integer id){
        return avionService.findById(id);
    }
    @PostMapping("/saveavion")
    private Integer saveVehicule(@RequestBody Avion avion){
        avionService.saveAvion(avion);
        return  avion.getId();
    }

    @GetMapping("/kilometrage")
    private List<Kilometrage> getAllKilometrage(){
        return  kilometrageService.findAllKilometrage();
    }

    @GetMapping("/kilometrage/{id}")
    private Kilometrage getKilometrage(@PathVariable("id") Integer id){
        return kilometrageService.findById(id);
    }
    @PostMapping("/savekilometrage")
    private Integer saveKilometrage(@RequestBody Kilometrage kilometrage){
       kilometrageService.saveKilometrage(kilometrage);
       return  kilometrage.getId();
    }

    @GetMapping("/assurance")
    private List<Assurance> getAllAssurance(){
        return  assuranceService.findAllAssurance();
    }

    @GetMapping("/assurance/{id}")
    private Assurance getAssurance(@PathVariable("id") Integer id){
        return assuranceService.findById(id);
    }
    @PostMapping("/saveassurance")
    private Integer saveAssurance(@RequestBody Assurance assurance){
        assuranceService.saveAssurance(assurance);
        return  assurance.getId();
    }

    @GetMapping("/entretien")
    private List<Entretien> getAllEntretien(){
        return  entretienService.findAllEntretien();
    }

    @GetMapping("/entretien/{id}")
    private Entretien getEntretien(@PathVariable("id") Integer id){
        return entretienService.findById(id);
    }
    @PostMapping("/saveentretien")
    private Integer saveEntretien(@RequestBody Entretien e){
        entretienService.saveEntretien(e);
        return  e.getId();
    }

    @GetMapping("/getVehiculeExpirerAssurance/{mois}")
    private List<Assurance>  getVehiculeExpirerAssurance(@PathVariable("mois") Integer mois){
        return assuranceService.findAllAssuranceexpire(mois);
    }





}
