package com.example.brief15.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.brief15.entity.Book;

// Repository responsable de l'interaction avec la base de données.
// Il contient des méthodes pour effectuer des opérations CRUD (Create, Read, Update, Delete) sur les entités.

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

}
