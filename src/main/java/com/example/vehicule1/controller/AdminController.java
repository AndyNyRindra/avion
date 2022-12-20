package com.example.vehicule1.controller;

import com.example.vehicule1.model.Admin;
import com.example.vehicule1.model.AdminToken;
import com.example.vehicule1.service.AdminService;
import com.example.vehicule1.service.AdminTokenService;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Date;
import java.util.List;


@CrossOrigin
@RestController
public class AdminController {

    private final AdminService adminService;

    private final AdminTokenService adminTokenService;

    public AdminController(AdminService adminService, AdminTokenService adminTokenService) {
        this.adminService = adminService;
        this.adminTokenService = adminTokenService;
    }


    @PostMapping("/login")
    public AdminToken login(@RequestBody Admin admin/*@RequestParam(value = "email") String email,@RequestParam(value = "mdp") String mdp*/){

        Admin admin1 = adminService.login(admin.getEmail(), admin.getMdpadmin());

        if (admin1 != null) {
            adminTokenService.unvalidOldToken(admin1.getId());
            AdminToken adminToken =new AdminToken();
            adminToken.setAdmin(admin1);
            adminToken.setValue(adminToken.generateToken());
            LocalDateTime dateExp=LocalDateTime.now().plusMinutes(60);
            Instant instant=dateExp.toInstant(ZoneOffset.UTC);
            adminToken.setDateExp(Date.from(instant));
            adminTokenService.saveToken(adminToken);
            return  adminToken;
            //modelJSON.setData(adminToken);

        }
        else{
            return null;
        }


    }

    @GetMapping("/token/check/")
    private AdminToken checkToken(@RequestHeader("token") String value){
        //ModelJSON modelJSON= new ModelJSON();
        AdminToken adminToken=adminTokenService.checkToken(value);
        if(adminToken==null){
            return null;
        }
        else{
            return  adminToken;
        }

    }

    @GetMapping("/token/logout")
    private AdminToken logout(@RequestHeader("token") String token){
//        Admin admin=adminService.getById(id);
        AdminToken adminToken=adminTokenService.getValidTokenByToken(token);
//        List<AdminToken> adminToken=adminTokenService.getValidToken(admin.getId());
        if(adminToken==null){
            return null;
        }
        else{
            AdminToken adminTokenRes= adminTokenService.logout(adminToken);
            return adminTokenRes;
        }


    }
}