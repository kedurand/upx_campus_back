package com.example.upx_campus_back.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

/**
 * The type Activite.
 */
@Entity
@Table(name = "activite")
public class Activite extends AuditModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "text")
    private String text;

    @ManyToMany(mappedBy = "activites")
    @JsonIgnore
    private Set<Thematique> thematiques;

    @ManyToMany(mappedBy = "activites")
    @JsonIgnore
    private Set<Batiment> batiments;

    /**
     * Instantiates a new Activite.
     */
    public Activite() {
    }

    /**
     * Instantiates a new Activite.
     *
     * @param text        the text
     * @param thematiques the thematiques
     * @param batiments   the batiments
     */
    public Activite(String text, Set<Thematique> thematiques, Set<Batiment> batiments) {
        this.text = text;
        this.thematiques = thematiques;
        this.batiments = batiments;
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
     * Gets text.
     *
     * @return the text
     */
    public String getText() {
        return text;
    }

    /**
     * Sets text.
     *
     * @param text the text
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * Gets thematiques.
     *
     * @return the thematiques
     */
    public Set<Thematique> getThematiques() {
        return thematiques;
    }

    /**
     * Sets thematiques.
     *
     * @param thematiques the thematiques
     */
    public void setThematiques(Set<Thematique> thematiques) {
        this.thematiques = thematiques;
    }

    /**
     * Gets batiments.
     *
     * @return the batiments
     */
    public Set<Batiment> getBatiments() {
        return batiments;
    }

    /**
     * Sets batiments.
     *
     * @param batiments the batiments
     */
    public void setBatiments(Set<Batiment> batiments) {
        this.batiments = batiments;
    }
}
