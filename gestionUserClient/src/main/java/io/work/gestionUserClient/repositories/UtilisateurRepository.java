package io.work.gestionUserClient.repositories;

import io.work.gestionUserClient.entity.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long > {
    public List<Utilisateur> findByNom(String nom);
    public List<Utilisateur> findByPrenom(String prenom);
    public List<Utilisateur> findAllByPassword(String password);

    boolean existsByEmail(String email);

    boolean existsByUsername(String username);
    Optional<Utilisateur> findByUsername(String username);


}
