package com.example.vehicule1.service;

import com.example.vehicule1.repository.*;
import com.example.vehicule1.model.*;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class AdminService {
    public final AdminRepository adminRepository;

    public AdminService(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }




    public Admin login(String email, String mdpadmin) {
        return adminRepository.findByEmailAndMdp(email, mdpadmin);
    }


    public Admin getById(Integer id) {
        Optional<Admin> admin=adminRepository.findById(id);
        return admin.orElse(null);
    }
}
