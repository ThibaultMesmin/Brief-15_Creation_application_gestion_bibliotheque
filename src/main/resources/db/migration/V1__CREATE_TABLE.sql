CREATE TABLE livre (
   id BIGINT AUTO_INCREMENT PRIMARY KEY,
   titre VARCHAR(255) NOT NULL,
    auteur VARCHAR(255) NOT NULL,
    nb_exemplaires_disponibles INT NOT NULL
);

CREATE TABLE genre (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nom VARCHAR(255) NOT NULL
);

CREATE TABLE emprunteur (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nom VARCHAR(255) NOT NULL,
    prenom VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL
);

CREATE TABLE emprunt (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    date_emprunt DATE NOT NULL,
    date_retour DATE,
    livre_id BIGINT NOT NULL,
    emprunteur_id BIGINT NOT NULL,
    FOREIGN KEY (livre_id) REFERENCES livre(id),
    FOREIGN KEY (emprunteur_id) REFERENCES emprunteur(id)
);

CREATE TABLE livre_genre (
    livre_id BIGINT NOT NULL,
    genre_id BIGINT NOT NULL,
    PRIMARY KEY (livre_id, genre_id),
    FOREIGN KEY (livre_id) REFERENCES livre(id),
    FOREIGN KEY (genre_id) REFERENCES genred(id);
