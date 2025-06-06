package com.backend.dataguard.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.dataguard.domain.Turno;
import com.backend.dataguard.service.TurnoService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/turnos")
public class TurnoController {

    @Autowired
    private TurnoService turnoService;

    @GetMapping
    public List<Turno> listar() {
        return turnoService.listar();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Turno> buscar(@PathVariable Long id) {
        return turnoService.buscar(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
        
    }

    @PostMapping
    public Turno criar(@Valid @RequestBody Turno turno) {
        return turnoService.criar(turno);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Turno> update(@PathVariable Long id, @RequestBody Turno turno) {
        return turnoService.buscar(id)
                .map(turnoExistente -> {
                    // Atualize os campos relevantes aqui
                    turno.setUsuario(turno.getUsuario());
                    turno.setData(turno.getData());
                    turno.setPeriodo(turno.getPeriodo());
                    turno.setObservacoesSeguranca(turno.getObservacoesSeguranca());
                    turno.setDdsms(turno.getDdsms());
                    turno.setEfetivoNoSite(turno.getEfetivoNoSite());
                    Turno turnoAlt = turnoService.criar(turno);
                    return ResponseEntity.ok(turnoAlt);
                })
                .orElse(ResponseEntity.notFound().build());
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable Long id) {
        if (turnoService.buscar(id).isPresent()) {
            turnoService.excluir(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
