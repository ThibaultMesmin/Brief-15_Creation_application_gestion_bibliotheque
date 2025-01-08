package com.example.brief15.service;

import com.example.brief15.entity.Book;
import com.example.brief15.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// Couche intermédiaire entre la couche repository et la couche controller
// Elle permet de gérer les données avant de les envoyer à la couche controller
// Elle peut contenir une méthode qui vérifie pour un email donné contient bien un @ c'est une méthode logique métier


@Service
public class BookService {
        @Autowired
        private BookRepository bookRepository;

    public Book saveBook(Book book) {
        if (book.getTitle() == null) {
            throw new IllegalArgumentException("Le titre du livre ne peut pas être vide.");
        }
        if (book.getAuthor() == null) {
            throw new IllegalArgumentException("L'auteur du livre ne peut pas être vide.");
        }
        return bookRepository.save(book); }

        public List<Book> getAllBooks() {
            return bookRepository.findAll();
        }

        public void deleteBook(Long id) {
            bookRepository.deleteById(id);
        }
}
