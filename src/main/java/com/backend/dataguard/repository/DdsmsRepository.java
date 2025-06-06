package com.backend.dataguard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend.dataguard.domain.Ddsms;

@Repository
public interface DdsmsRepository extends JpaRepository<Ddsms, Long>{

}
