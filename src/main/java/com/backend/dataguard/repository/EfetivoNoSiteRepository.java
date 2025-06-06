package com.backend.dataguard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend.dataguard.domain.EfetivoNoSite;

@Repository
public interface EfetivoNoSiteRepository extends JpaRepository<EfetivoNoSite, Long>{

}
