package com.Medisoft.Medisoft.Repositories;

import com.Medisoft.Medisoft.Entities.Sexo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SexoRepository extends JpaRepository<Sexo, Integer> {
}
