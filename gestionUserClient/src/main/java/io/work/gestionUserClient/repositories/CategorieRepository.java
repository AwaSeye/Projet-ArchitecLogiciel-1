package io.work.gestionUserClient.repositories;


import io.work.gestionUserClient.entity.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategorieRepository extends JpaRepository<Categorie, Long > {
    public List<Categorie> findByLibelle(String libelle);
}
