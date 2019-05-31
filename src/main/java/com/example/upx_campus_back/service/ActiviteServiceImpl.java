package com.example.upx_campus_back.service;

import com.example.upx_campus_back.model.Activite;
import com.example.upx_campus_back.model.Batiment;
import com.example.upx_campus_back.repository.ActiviteRepository;
import com.example.upx_campus_back.repository.ActiviteRepositoryImpl;

import java.util.List;

public class ActiviteServiceImpl implements  ActiviteService{
    private ActiviteRepositoryImpl activiteRepository;

    public List<Activite> findAll() {
        return activiteRepository.findAll();
    }
}
