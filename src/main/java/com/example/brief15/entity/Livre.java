package com.example.brief15.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

//Une Entity en JPA (Java Persistence API) représente une classe persistante qui est mappée à une table de la base de données.
// Chaque instance de cette classe correspondra à une ligne dans la table.

// Le mappage fait référence au processus d'associer des classes Java à des tables de base de données,

@Entity
@Data
public class Livre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titre;
    private String auteur;

    @ManyToMany
    @JoinTable(
            name = "livre_genre",
            joinColumns = @JoinColumn(name = "lire_id"),
            inverseJoinColumns = @JoinColumn(name = "genre_id")
    )
    private List<Genre> genres;

    @OneToMany(mappedBy = "livre")
    private List<Emprunt> emprunts;
}
