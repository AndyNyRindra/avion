package com.example.vehicule1.service;

import com.example.vehicule1.repository.*;
import com.example.vehicule1.model.*;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Date;
import java.util.List;



@Service
public class AdminTokenService {
    AdminTokenRepository adminTokenRepository;

    public AdminTokenService(AdminTokenRepository adminTokenRepository) {
        this.adminTokenRepository = adminTokenRepository;
    }


    public AdminToken saveToken(AdminToken adminToken) {
        return adminTokenRepository.save(adminToken);
    }


    public List<AdminToken> getValidToken(Integer idAdmin) {

        List<AdminToken> list=adminTokenRepository.getValidTokenById(idAdmin);
        return list;
    }


    public AdminToken getValidTokenByToken(String token) {
        return adminTokenRepository.getTokenByValue(token);
    }


    public AdminToken logout(AdminToken adminToken) {
        adminToken.setDateExp(Date.from(LocalDateTime.now().toInstant(ZoneOffset.UTC)));
        adminTokenRepository.save(adminToken);
        return adminToken;
    }


    public AdminToken checkToken(String value) {
        return adminTokenRepository.getTokenByValue(value);
    }


    public void unvalidOldToken(Integer idAdmin){
        adminTokenRepository.unvalidOldToken(idAdmin);
    }
}
