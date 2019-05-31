package com.example.upx_campus_back.repository;

import com.example.upx_campus_back.model.Batiment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Utilise un framework de Spring, le "Spring Data JPA"
@Repository
public interface BatimentRepository extends JpaRepository<Batiment, Long> {
}
