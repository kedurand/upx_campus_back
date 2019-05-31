package com.example.upx_campus_back.repository;

import com.example.upx_campus_back.model.Activite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Utilise un framework de Spring, le "Spring Data JPA"
// Besoin d'uniquement d'étendre la classe JPA avec la classe et le type de l'ID

// Doc officielle
// https://docs.spring.io/spring-data/jpa/docs/current/reference/html/

// Mot clef de convention JPA et Spring:
// https://docs.spring.io/spring-data/data-jpa/docs/1.1.x/reference/html/#jpa.query-methods.query-creation

// Comment utilisé "Optional" en Java:
// https://stackoverflow.com/questions/49316751/spring-data-jpa-findone-change-to-optional-how-to-use-this/49317013
@Repository
public interface ActiviteRepository extends JpaRepository<Activite, Long> {
    public Activite findById(Long id);
}
