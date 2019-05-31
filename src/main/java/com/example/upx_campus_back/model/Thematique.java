package com.example.upx_campus_back.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name ="thematique")
public class Thematique extends AuditModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "text")
    private String text;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "thematique")
    @JsonIgnore
    private Set<Activite> activites;

    public Thematique() {
    }

    public Thematique(String text, Set<Activite> activites) {
        this.text = text;
        this.activites = activites;
    }
}
