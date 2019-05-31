package com.example.upx_campus_back.controller;

import com.example.upx_campus_back.model.Activite;
import com.example.upx_campus_back.service.ActiviteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*
    Fait le mapping des URL de l'API REST.
    Chaque requête REST va lancer l'action du service associé
*/
@RestController
public class ActiviteController {
    private ActiviteService activiteService;

    @GetMapping("/batiments")
    public List<Activite> getBatiments(){
        return activiteService.findAll();
    }

}
