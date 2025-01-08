package com.example.brief15.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Entity
@Data
public class Loaning {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate date;
    private LocalDate returnDate;
    private String status;

    @ManyToOne
    @JoinColumn(name = "borrower_id")
    private Borrower borrower;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;
}
