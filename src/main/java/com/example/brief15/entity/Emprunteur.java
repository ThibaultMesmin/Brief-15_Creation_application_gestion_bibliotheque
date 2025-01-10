package com.example.brief15.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Entity
@Data
public class Emprunteur {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String prenom;
    private String nom;

    @OneToMany(mappedBy = "emprunteur")
    private List<Emprunt> emprunts;
}
