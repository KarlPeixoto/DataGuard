package com.backend.dataguard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend.dataguard.domain.Turno;

@Repository
public interface TurnoRepository extends JpaRepository<Turno, Long>{

}
