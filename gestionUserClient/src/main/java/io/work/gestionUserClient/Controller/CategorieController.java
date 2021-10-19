package io.work.gestionUserClient.Controller;

import io.work.gestionUserClient.entity.Categorie;
import io.work.gestionUserClient.services.CategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins= "*")
@RequestMapping("/api/categorie")
public class CategorieController {
    @Autowired
    private CategorieService categorieService;

    @GetMapping
    public List<Categorie> getAllCategorie(){

        return categorieService.getAllCategorie();
    }

    @PostMapping
    public Categorie saveCategorie(@RequestBody Categorie categorie){
        return categorieService.saveCategorie(categorie);
    }

    @PostMapping("modifier")
    public Categorie updateCategorie(@RequestBody Categorie categorie){
        return categorieService.updateCategorie(categorie);
    }

    @DeleteMapping("/{id}")
    public void deleteCategorie(@PathVariable Long id){
        categorieService.deleteCategorie(id);
    }
}





