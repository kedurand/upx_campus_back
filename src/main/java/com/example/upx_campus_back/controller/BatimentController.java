package com.example.upx_campus_back.controller;

import com.example.upx_campus_back.service.ActiviteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BatimentController {
    @Autowired
    private BatimentServiceImpl batimentService;

    @GetMapping("/batiment")
}
