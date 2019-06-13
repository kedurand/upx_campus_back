package com.example.upx_campus_back.repository;

import com.example.upx_campus_back.model.Batiment;
import com.example.upx_campus_back.model.Thematique;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * The interface Thematique repository.
 */
@Repository
public interface ThematiqueRepository extends JpaRepository<Thematique, Long> {

}
