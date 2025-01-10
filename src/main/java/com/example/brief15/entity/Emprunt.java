package com.example.brief15.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Entity
@Data
public class Emprunt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate date;
    private LocalDate DateRetour;
    private String status;

    @ManyToOne
    @JoinColumn(name = "empreunteur_id")
    private Emprunteur emprunteur;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private Livre livre;
}
