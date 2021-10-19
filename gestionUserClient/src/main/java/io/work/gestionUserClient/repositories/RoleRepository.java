package io.work.gestionUserClient.repositories;

import io.work.gestionUserClient.entity.Role;
import io.work.gestionUserClient.utils.ERole;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
