package com.Medisoft.Medisoft.Repositories;

import com.Medisoft.Medisoft.Entities.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Integer> {
    Persona findByNombre(String nombre);
}
