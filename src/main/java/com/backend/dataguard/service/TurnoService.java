package com.backend.dataguard.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.dataguard.domain.Turno;
import com.backend.dataguard.repository.TurnoRepository;

@Service
public class TurnoService {

    @Autowired
    private TurnoRepository turnoRepository;
    
    public List<Turno> listar() {
        return turnoRepository.findAll();
    }

    public Optional<Turno> buscar(Long id) {
        return turnoRepository.findById(id);
    }

    public Turno criar(Turno turno) {
        return turnoRepository.save(turno);
    }

    public void excluir(Long id) {
        turnoRepository.deleteById(id);
    }
}
