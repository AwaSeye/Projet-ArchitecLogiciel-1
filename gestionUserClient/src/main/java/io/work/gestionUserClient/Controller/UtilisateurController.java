package io.work.gestionUserClient.Controller;

import io.work.gestionUserClient.entity.Utilisateur;
import io.work.gestionUserClient.services.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins= "*")
@RequestMapping("/api/utilisateur")
public class UtilisateurController {
    @Autowired
    private UtilisateurService utilisateurService;

    @GetMapping
    public List<Utilisateur> getAllUtilisateur(){

        return utilisateurService.getAllUtilisateur();
    }

    @PostMapping
    public Utilisateur saveUtilisateur(@RequestBody Utilisateur utilisateur){
        return utilisateurService.saveUtilisateur(utilisateur);
    }

    @PostMapping("modifier")
    public Utilisateur updateUtilisateur(@RequestBody Utilisateur utilisateur){
        return utilisateurService.updateUtilisateur(utilisateur);
    }

    @DeleteMapping("/{id}")
    public void deleteUtilisateur(@PathVariable Long id){
        utilisateurService.deleteUtilisateur(id);
    }
}





