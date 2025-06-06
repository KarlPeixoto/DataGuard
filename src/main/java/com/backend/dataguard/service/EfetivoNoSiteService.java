package com.backend.dataguard.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.backend.dataguard.domain.EfetivoNoSite;
import com.backend.dataguard.repository.EfetivoNoSiteRepository;

@Repository
public class EfetivoNoSiteService {

    @Autowired
    public EfetivoNoSiteRepository efetivoNoSiteRepository;
    
    public List<EfetivoNoSite> listar() {
        return efetivoNoSiteRepository.findAll();
    }

    public Optional<EfetivoNoSite> buscar(Long id) {
         return efetivoNoSiteRepository.findById(id);
        
    }

    public EfetivoNoSite criar(EfetivoNoSite efetivoNoSite) {
        return efetivoNoSiteRepository.save(efetivoNoSite);
    }

    public void excluir(Long id) {
        efetivoNoSiteRepository.deleteById(id);
    }
}
