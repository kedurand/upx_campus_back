package com.example.upx_campus_back.service;

import com.example.upx_campus_back.model.Activite;
import com.example.upx_campus_back.repository.ActiviteRepository;

import java.util.List;

public class ActiviteServiceImpl implements  ActiviteService{
    private ActiviteRepository activiteRepository;

    public List<Activite> findAll() {
        return activiteRepository.findAll();
    }
}
