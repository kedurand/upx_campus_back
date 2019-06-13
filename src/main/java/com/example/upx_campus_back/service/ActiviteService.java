package com.example.upx_campus_back.service;

import com.example.upx_campus_back.model.Activite;

import java.util.List;

/**
 * The interface Activite service.
 */
public interface ActiviteService {
    /**
     * Gets activites.
     *
     * @return the activites
     */
    List<Activite> getActivites();

    /**
     * Gets activite.
     *
     * @param activiteId the activite id
     * @return the activite
     */
    Activite getActivite(Long activiteId);

    /**
     * Add activite activite.
     *
     * @param activite the activite
     * @return the activite
     */
    Activite addActivite(Activite activite);

    /**
     * Modify activite activite.
     *
     * @param activiteId      the activite id
     * @param activiteRequest the activite request
     * @return the activite
     */
    Activite modifyActivite(Long activiteId, Activite activiteRequest);

    /**
     * Delete activite.
     *
     * @param activiteId the activite id
     */
    void deleteActivite(Long activiteId);
}
