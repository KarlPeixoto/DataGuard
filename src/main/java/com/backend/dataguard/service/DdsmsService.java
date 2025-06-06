package com.backend.dataguard.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.dataguard.domain.Ddsms;
import com.backend.dataguard.repository.DdsmsRepository;

@Service
public class DdsmsService {

    @Autowired
    public DdsmsRepository ddsmsRepository;

    public List<Ddsms> listar() {
        return ddsmsRepository.findAll();
    }

    public Optional<Ddsms> buscar(Long id) {
         return ddsmsRepository.findById(id);
        
    }

    public Ddsms criar(Ddsms ddsms) {
        return ddsmsRepository.save(ddsms);
    }

    public void excluir(Long id) {
        ddsmsRepository.deleteById(id);
    }
}
