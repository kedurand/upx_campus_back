package com.example.upx_campus_back.service;

import com.example.upx_campus_back.model.Batiment;

import java.util.List;

/**
 * The interface Batiment service.
 */
public interface BatimentService {
    /**
     * Gets batiments.
     *
     * @return the batiments
     */
    List<Batiment> getBatiments();

    /**
     * Gets batiment.
     *
     * @param batimentId the batiment id
     * @return the batiment
     */
    Batiment getBatiment(Long batimentId);

    /**
     * Get batiment image byte [ ].
     *
     * @param batimentId the batiment id
     * @return the byte [ ]
     */
    byte[] getBatimentImage(Long batimentId);

    /**
     * Recuperer la liste des batiments appartenant à l'activité courante
     *
     * @param idActivite the id activite
     * @return the batiments
     */
    List<Batiment> getBatimentsByActivite(long idActivite);

    /**
     * Recuperer la liste des batiments appartenant à la thematique courante courante
     *
     * @param idThematique the thematique id
     * @return the batiments by thematique
     */
    List<Batiment> getBatimentsByThematique(long idThematique);

    /**
     * Add batiment batiment.
     *
     * @param batiment the batiment
     * @return the batiment
     */
    Batiment addBatiment(Batiment batiment);

    /**
     * Modify batiment batiment.
     *
     * @param batimentId      the batiment id
     * @param batimentRequest the batiment request
     * @return the batiment
     */
    Batiment modifyBatiment(Long batimentId, Batiment batimentRequest);

    /**
     * Delete batiment.
     *
     * @param batimentId the batiment id
     */
    void deleteBatiment(Long batimentId);

}
