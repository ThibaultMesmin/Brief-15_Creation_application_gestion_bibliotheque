package com.example.brief15.service;

import com.example.brief15.entity.Livre;
import com.example.brief15.repository.LivreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// Couche intermédiaire entre la couche repository et la couche controller
// Elle permet de gérer les données avant de les envoyer à la couche controller
// Elle peut contenir une méthode qui vérifie pour un email donné contient bien un @ c'est une méthode logique métier


@Service
public class LivreService {
        @Autowired
        private LivreRepository livreRepository;

    public Livre saveBook(Livre livre) {
        if (livre.getTitre() == null) {
            throw new IllegalArgumentException("Le titre du livre ne peut pas être vide.");
        }
        if (livre.getAuteur() == null) {
            throw new IllegalArgumentException("L'auteur du livre ne peut pas être vide.");
        }
        return livreRepository.save(livre); }

        public List<Livre> getAllBooks() {
            return livreRepository.findAll();
        }

        public void deleteBook(Long id) {
            livreRepository.deleteById(id);
        }
}
