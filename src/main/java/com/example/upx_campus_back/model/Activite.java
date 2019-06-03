package com.example.upx_campus_back.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "activite")
public class Activite extends AuditModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "text")
    private String text;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "thematique_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Thematique thematique;

    @ManyToMany(mappedBy = "activites")
    private Set<Batiment> batiments;

    public Activite() {
    }

    public Activite(String text, Thematique thematique, Set<Batiment> batiments) {
        this.text = text;
        this.thematique = thematique;
        this.batiments = batiments;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Thematique getThematique() {
        return thematique;
    }

    public void setThematique(Thematique thematique) {
        this.thematique = thematique;
    }

    public Set<Batiment> getBatiments() {
        return batiments;
    }

    public void setBatiments(Set<Batiment> batiments) {
        this.batiments = batiments;
    }
}
