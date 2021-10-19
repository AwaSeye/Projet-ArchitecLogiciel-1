package io.work.gestionUserClient.services;

import io.work.gestionUserClient.entity.Categorie;

import java.util.List;

public interface CategorieService {
    public List<Categorie> getAllCategorie();
    public Categorie saveCategorie(Categorie categorie);
    public Categorie updateCategorie(Categorie categorie);
    public  void deleteCategorie(Long id);
}
