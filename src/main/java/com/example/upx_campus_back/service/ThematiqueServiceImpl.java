package com.example.upx_campus_back.service;

import com.example.upx_campus_back.model.Thematique;
import com.example.upx_campus_back.repository.ThematiqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * The type Thematique service.
 */
@Component
public class ThematiqueServiceImpl implements ThematiqueService {
    // Il n'utilise que l'interface, pas besoin d'implémentation
    // Autowired permet de le construire automatiquement ?
    @Autowired
    private ThematiqueRepository thematiqueRepository;


    @Override
    public List<Thematique> getThematiques() {
        return thematiqueRepository.findAll();
    }

    @Override
    public Thematique getThematique(Long thematiqueId) {
        return thematiqueRepository.findById(thematiqueId).orElse(null);
    }

    @Override
    public Thematique addThematique(Thematique thematique) {
        return thematiqueRepository.save(thematique);
    }

    @Override
    public Thematique modifyThematique(Long thematiqueId, Thematique thematiqueRequest) {
        Thematique thematique = thematiqueRepository.findById(thematiqueId).orElse(null);
        if (thematique != null) {
            thematique.setText(thematiqueRequest.getText());
            thematique.setActivites(thematiqueRequest.getActivites());
            thematiqueRepository.save(thematique);
        }
        return thematique;
    }

    @Override
    public void deleteThematique(Long thematiqueId) {
        thematiqueRepository.deleteById(thematiqueId);
    }
}
