package io.work.gestionUserClient.repositories;

import io.work.gestionUserClient.entity.Article;
import io.work.gestionUserClient.entity.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.print.attribute.standard.DateTimeAtCreation;
import java.util.List;

public interface ArticleRepository extends JpaRepository<Article, Long > {
    public List<Article> findByTitre(String titre);
    public List<Article> findByContenu(String contenu);
    public List<Article> findAllByDateCreation(DateTimeAtCreation dateCreation);
    public List<Article> findAllByCategorie(Categorie categorie);
}
