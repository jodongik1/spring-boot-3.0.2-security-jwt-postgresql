package org.dongikjo.jwt.repository;

import java.util.Optional;

import org.dongikjo.jwt.models.ERole;
import org.dongikjo.jwt.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
  Optional<Role> findByName(ERole name);
}
