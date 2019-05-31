package com.example.upx_campus_back.repository;

import com.example.upx_campus_back.model.Thematique;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ThematiqueRepository extends JpaRepository<Thematique, Long>{
}