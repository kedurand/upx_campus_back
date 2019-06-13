package com.example.upx_campus_back.service;

import com.example.upx_campus_back.model.Batiment;
import com.example.upx_campus_back.model.Thematique;

import java.util.List;

/**
 * The interface Thematique service.
 */
public interface ThematiqueService {
    /**
     * Gets thematiques.
     *
     * @return the thematiques
     */
    List<Thematique> getThematiques();

    /**
     * Gets thematique.
     *
     * @param thematiqueId the thematique id
     * @return the thematique
     */
    Thematique getThematique(Long thematiqueId);

    /**
     * Add thematique thematique.
     *
     * @param thematique the thematique
     * @return the thematique
     */
    Thematique addThematique(Thematique thematique);

    /**
     * Modify thematique thematique.
     *
     * @param thematiqueId      the thematique id
     * @param thematiqueRequest the thematique request
     * @return the thematique
     */
    Thematique modifyThematique(Long thematiqueId, Thematique thematiqueRequest);

    /**
     * Delete thematique.
     *
     * @param thematiqueId the thematique id
     */
    void deleteThematique(Long thematiqueId);

    /**
     * Recuperer la liste des batiments appartenant à la thematique courante courante
     *
     * @param idThematique the thematique id
     */
    List<Batiment> getBatiments(long idThematique);

}
