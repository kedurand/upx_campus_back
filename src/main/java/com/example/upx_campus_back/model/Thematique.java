package com.example.upx_campus_back.model;

import javax.persistence.*;
import java.util.Set;

/**
 * The type Thematique.
 */
@Entity
@Table(name = "thematique")
public class Thematique extends AuditModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "text")
    private String text;

    @ManyToMany(cascade = CascadeType.MERGE)
    private Set<Activite> activites;


    /**
     * Instantiates a new Thematique.
     */
    public Thematique() {
    }

    /**
     * Instantiates a new Thematique.
     *
     * @param text      the text
     * @param activites the activites
     */
    public Thematique(String text, Set<Activite> activites) {
        this.text = text;
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
