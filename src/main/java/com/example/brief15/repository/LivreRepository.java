package com.example.brief15.repository;
import com.example.brief15.entity.Livre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Repository responsable de l'interaction avec la base de données.
// Il contient des méthodes pour effectuer des opérations CRUD (Create, Read, Update, Delete) sur les entités.

@Repository
public interface LivreRepository extends JpaRepository<Livre, Long> {

}
