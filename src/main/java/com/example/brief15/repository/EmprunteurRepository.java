package com.example.brief15.repository;

import com.example.brief15.entity.Emprunteur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmprunteurRepository extends JpaRepository<Emprunteur, Long> {
}
