-- Insérer des genres
INSERT INTO genre (nom) VALUES ('Science-Fiction');
INSERT INTO genre (nom) VALUES ('Aventure');
INSERT INTO genre (nom) VALUES ('Fantastique');

-- Insérer des livres
INSERT INTO livre (titre, auteur, nb_exemplaires_disponibles) VALUES ('Dune', 'Frank Herbert', 10);
INSERT INTO livre (titre, auteur, nb_exemplaires_disponibles) VALUES ('Le Hobbit', 'J.R.R. Tolkien', 5);
INSERT INTO livre (titre, auteur, nb_exemplaires_disponibles) VALUES ('1984', 'George Orwell', 7);

-- Associer des livres à des genres
INSERT INTO livre_genre (livre_id, genre_id) VALUES (1, 1); -- Dune -> Science-Fiction
INSERT INTO livre_genre (livre_id, genre_id) VALUES (2, 2); -- Le Hobbit -> Aventure
INSERT INTO livre_genre (livre_id, genre_id) VALUES (3, 1); -- 1984 -> Science-Fiction
INSERT INTO livre_genre (livre_id, genre_id) VALUES (3, 2); -- 1984 -> Aventure

-- Insérer des emprunteurs
INSERT INTO emprunteur (nom, prenom, email) VALUES ('Dupont', 'Jean', 'jean.dupont@example.com');
INSERT INTO emprunteur (nom, prenom, email) VALUES ('Martin', 'Claire', 'claire.martin@example.com');
INSERT INTO emprunteur (nom, prenom, email) VALUES ('Legrand', 'Paul', 'paul.legrand@example.com');

-- Insérer des emprunts
INSERT INTO emprunt (date_emprunt, date_retour, livre_id, emprunteur_id) VALUES ('2023-01-01', '2023-01-15', 1, 1);
INSERT INTO emprunt (date_emprunt, date_retour, livre_id, emprunteur_id) VALUES ('2023-01-10', '2023-01-20', 2, 2);
INSERT INTO emprunt (date_emprunt, date_retour, livre_id, emprunteur_id) VALUES ('2023-01-15', '2023-01-25', 3, 3);
