package com.example.upx_campus_back.service;

import com.example.upx_campus_back.model.Batiment;
import com.example.upx_campus_back.repository.BatimentRepository;
import com.example.upx_campus_back.util.UtilImage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.File;
import java.util.Base64;
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
    public byte[] getBatimentImage(Long batimentId) {
        Batiment bat = batimentRepository.findById(batimentId).orElse(null);
        // Encodage en string via une base64 des byte de l'image :)
        /*  Base64 encoding schemes are commonly used when there is a need to encode binary data
            that needs be stored and transferred over media that are designed to deal with textual data.
            This is to ensure that the data remains intact without modification during transport.
         */
        byte[] encoded = null;
        // On vérifie que le batiment existe et que son image également est enregistrée
        if (bat != null && !bat.getImage().isEmpty()) {
            File file = UtilImage.getImageFile(bat.getImage());
            if(file!=null){
                encoded = Base64.getEncoder().encode(UtilImage.getByteFromImageFile(file));
            }
        }
        return encoded;
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
