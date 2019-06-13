package com.example.upx_campus_back.service;

import com.example.upx_campus_back.model.Activite;
import com.example.upx_campus_back.model.Batiment;
import com.example.upx_campus_back.repository.ActiviteRepository;
import com.example.upx_campus_back.repository.BatimentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.List;

/**
 * The type Activite service.
 */
/*
    Permet d'ajouter des controls supplémentaire vis à vis du métier
    https://openclassrooms.com/fr/courses/4668056-construisez-des-microservices/5123366-utilisez-jpa-pour-communiquer-avec-une-base-de-donnees
 */
@Component
public class ActiviteServiceImpl implements ActiviteService {
    // Il n'utilise que l'interface, pas besoin d'implémentation
    // Autowired permet de le construire automatiquement ?
    @Autowired
    private ActiviteRepository activiteRepository;

    @Autowired
    private BatimentRepository batimentRepository;


    @Override
    public List<Activite> getActivites() {
        return activiteRepository.findAll();
    }

    @Override
    public Activite getActivite(Long activiteId) {
        return activiteRepository.findById(activiteId).orElse(null);
    }

    @Override
    public Activite addActivite(Activite activite) {
        return activiteRepository.save(activite);
    }

    @Override
    public Activite modifyActivite(Long activiteId, Activite activiteRequest) {
        Activite activite = activiteRepository.findById(activiteId).orElse(null);
        if (activite != null) {
            activite.setText(activiteRequest.getText());
            activite.setThematiques(activiteRequest.getThematiques());
            activite.setBatiments(activiteRequest.getBatiments());
            activiteRepository.save(activite);
        }
        return activite;
    }

    @Override
    public void deleteActivite(Long activiteId) {
        activiteRepository.deleteById(activiteId);
    }

    @Override
    public List<Batiment> getBatiments(long idActivite){

        return batimentRepository.findBatimentsByActivite(idActivite) ;

    }

}
