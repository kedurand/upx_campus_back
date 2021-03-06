package com.example.upx_campus_back.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Set;


/**
 * The type Batiment.
 */
// https://hellokoding.com/jpa-many-to-many-relationship-mapping-example-with-spring-boot-maven-and-mysql/
@Entity
@Table(name = "batiment")
public class Batiment extends AuditModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // On utilise le géénrateur PostgreSQL
    private Long id;

    @NotBlank
    @Size(min = 3, max = 100)
    private String nom;

    private float lat;
    private float lng;

    // Ne va pas renvoyer en JSON le path de l'image
    @JsonIgnore
    private String image;

    @Column(columnDefinition = "text")
    private String description;

    @ManyToMany(cascade = {CascadeType.MERGE})
    private Set<Activite> activites;

    /**
     * Instantiates a new Batiment.
     */
    public Batiment() {
    }

    /**
     * Instantiates a new Batiment.
     *
     * @param nom         the nom
     * @param lat         the lat
     * @param lng         the lng
     * @param image       the image
     * @param description the description
     * @param activites   the activites
     */
    public Batiment(@NotBlank @Size(min = 3, max = 100) String nom, float lat, float lng,
                    String image, String description, Set<Activite> activites) {
        this.nom = nom;
        this.lat = lat;
        this.lng = lng;
        // TODO: Prévoir de coder le comportement d'enregistrement de l'image en back si on fait un post depuis client
        this.image = image;
        this.description = description;
        this.activites = activites;
    }

    /**
     * Instantiates a new Batiment.
     *
     * @param nom         the nom
     * @param lat         the lat
     * @param lng         the lng
     * @param description the description
     * @param activites   the activites
     */
    public Batiment(@NotBlank @Size(min = 3, max = 100) String nom, float lat,
                    float lng, String description, Set<Activite> activites) {
        this.nom = nom;
        this.lat = lat;
        this.lng = lng;
        this.description = description;
        this.activites = activites;
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Gets nom.
     *
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * Sets nom.
     *
     * @param nom the nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Gets lat.
     *
     * @return the lat
     */
    public float getLat() {
        return lat;
    }

    /**
     * Sets lat.
     *
     * @param lat the lat
     */
    public void setLat(float lat) {
        this.lat = lat;
    }

    /**
     * Gets lng.
     *
     * @return the lng
     */
    public float getLng() {
        return lng;
    }

    /**
     * Sets lng.
     *
     * @param lng the lng
     */
    public void setLng(float lng) {
        this.lng = lng;
    }

    /**
     * Gets image.
     *
     * @return the image
     */
    public String getImage() {
        return image;
    }

    /**
     * Sets image.
     *
     * @param image the image
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * Gets description.
     *
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets description.
     *
     * @param description the description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Gets activites.
     *
     * @return the activites
     */
    public Set<Activite> getActivites() {
        return activites;
    }

    /**
     * Sets activites.
     *
     * @param activites the activites
     */
    public void setActivites(Set<Activite> activites) {
        this.activites = activites;
    }
}

