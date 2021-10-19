package io.work.gestionUserClient.services.Impl;

import io.work.gestionUserClient.entity.Categorie;
import io.work.gestionUserClient.exceptions.ResourceNotFoundException;

import io.work.gestionUserClient.repositories.CategorieRepository;
import io.work.gestionUserClient.services.CategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategorieServiceImpl implements CategorieService {
    @Autowired
    private CategorieRepository categorieRepository;

    @Override
    public List<Categorie> getAllCategorie() {
        return categorieRepository.findAll();
    }

    @Override
    public Categorie saveCategorie(Categorie categorie) {
        return categorieRepository.save(categorie);
    }

    @Override
    public Categorie updateCategorie(Categorie categorie) {
        return categorieRepository.findById(categorie.getId())
                .map(categorie1 -> {
                    return categorieRepository.saveAndFlush(categorie);
                })
                .orElseThrow(()-> new ResourceNotFoundException("Cet categorie n'existe pas"));
    }

    @Override
    public void deleteCategorie(Long id) {

        categorieRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Cet categorie n'existe pas"));
        categorieRepository.deleteById(id);
    }
}
