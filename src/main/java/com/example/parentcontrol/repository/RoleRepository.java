package com.example.parentcontrol.repository;


import com.example.parentcontrol.entity.ERole;
import com.example.parentcontrol.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
  Optional<Role> findByName(ERole name);
}
