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

    @ManyToMany(mappedBy = "activites")
    @JsonIgnore
    private Set<Thematique> thematiques;

    @ManyToMany(mappedBy = "activites")
    @JsonIgnore
    private Set<Batiment> batiments;

    public Activite() {
    }

    public Activite(String text, Set<Thematique> thematiques, Set<Batiment> batiments) {
        this.text = text;
        this.thematiques = thematiques;
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

    public Set<Thematique> getThematiques() {
        return thematiques;
    }

    public void setThematiques(Set<Thematique> thematiques) {
        this.thematiques = thematiques;
    }

    public Set<Batiment> getBatiments() {
        return batiments;
    }

    public void setBatiments(Set<Batiment> batiments) {
        this.batiments = batiments;
    }
}
