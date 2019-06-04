package com.example.upx_campus_back.service;

import com.example.upx_campus_back.model.Batiment;
import com.example.upx_campus_back.repository.BatimentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * The type Batiment service.
 */
@Component
public class BatimentServiceImpl implements BatimentService {
    // Il n'utilise que l'interface, pas besoin d'implémentation
    // Autowired permet de le construire automatiquement ?
    @Autowired
    private BatimentRepository batimentRepository;

    @Override
    public List<Batiment> getBatiments() {
        return batimentRepository.findAll();
    }

    @Override
    public Batiment getBatiment(Long batimentId) {
        return batimentRepository.findById(batimentId).orElse(null);
    }

    @Override
    public Batiment addBatiment(Batiment batiment) {
        return batimentRepository.save(batiment);
    }

    @Override
    public Batiment modifyBatiment(Long batimentId, Batiment batimentRequest) {
        Batiment batiment = batimentRepository.findById(batimentId).orElse(null);
        if (batiment != null) {
            batiment.setNom(batimentRequest.getNom());
            batiment.setLat(batimentRequest.getLat());
            batiment.setLng(batimentRequest.getLng());
            batiment.setDescription(batimentRequest.getDescription());
            batiment.setActivites(batimentRequest.getActivites());
            batimentRepository.save(batiment);
        }
        return batiment;
    }

    @Override
    public void deleteBatiment(Long batimentId) {
        batimentRepository.deleteById(batimentId);
    }

}
