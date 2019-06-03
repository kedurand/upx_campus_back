package com.example.upx_campus_back.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Set;

@Entity
@Table(name ="batiment")
public class Batiment extends AuditModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // On utilise le géénrateur PostgreSQL
    private Long id;

    @NotBlank
    @Size(min = 3, max = 100)
    private String nom;

    private float lat;
    private float lng;

    @Column(columnDefinition = "text")
    private String description;

    @ManyToMany
    private Set<Activite> activites;

    public Batiment() {
    }

    public Batiment(@NotBlank @Size(min = 3, max = 100) String nom, float lat,
                    float lng, String description, Set<Activite> activites) {
        this.nom = nom;
        this.lat = lat;
        this.lng = lng;
        this.description = description;
        this.activites = activites;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public float getLat() {
        return lat;
    }

    public void setLat(float lat) {
        this.lat = lat;
    }

    public float getLng() {
        return lng;
    }

    public void setLng(float lng) {
        this.lng = lng;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Activite> getActivites() {
        return activites;
    }

    public void setActivites(Set<Activite> activites) {
        this.activites = activites;
    }
}

