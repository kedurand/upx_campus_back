package com.example.upx_campus_back.repository;

import com.example.upx_campus_back.model.Activite;
import com.example.upx_campus_back.model.Batiment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * The interface Batiment repository.
 */
@Repository
public interface BatimentRepository extends JpaRepository<Batiment, Long> {


    /**
     * Get Liste Batiments de l'activité
     *
     * @param activiteId the activite id
     * @return Une liste d'entier
     */
    @Query(value = "SELECT * FROM batiment WHERE id IN (SELECT batiments_id FROM batiment_activites b WHERE b.activites_id = ?1)", nativeQuery = true)
    List<Batiment> findBatimentsByActivite(long idActivite);
}
