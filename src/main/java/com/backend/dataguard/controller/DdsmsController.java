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

import com.backend.dataguard.domain.Ddsms;
import com.backend.dataguard.service.DdsmsService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/ddsms")
public class DdsmsController {

    @Autowired
    private DdsmsService ddsmsService;

    @GetMapping
    public List<Ddsms> listar() {
        return ddsmsService.listar();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Ddsms> buscar(@PathVariable Long id) {
        return ddsmsService.buscar(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Ddsms> criar(@Valid @RequestBody Ddsms ddsms) {
        return ResponseEntity.ok(ddsmsService.criar(ddsms));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Ddsms> atualizar(@PathVariable Long id, @Valid @RequestBody Ddsms ddsms) {
        return ddsmsService.buscar(id)
            .map(ddsmsExistente -> {
                ddsms.setTemaMecanica(ddsms.getTemaMecanica());
                ddsms.setTemaSerimax(ddsms.getTemaSerimax());
                ddsms.setTemaBaseLogistica(ddsms.getTemaBaseLogistica());
                ddsms.setTemaEletrica(ddsms.getTemaEletrica());
                ddsms.setTemaApplusQualitec(ddsms.getTemaApplusQualitec());
                ddsms.setTemaDomeBaseLog(ddsms.getTemaDomeBaseLog());
                ddsms.setTemaDomeFiringLine(ddsms.getTemaDomeFiringLine());
                ddsms.setTemaApplusRtd(ddsms.getTemaApplusRtd());
                ddsms.setTemaTeclado(ddsms.getTemaTeclado());
                ddsms.setTemaDomeMvArmz(ddsms.getTemaDomeMvArmz());
                ddsms.setTemaGBJ(ddsms.getTemaGBJ());
                ddsms.setTemaGPS(ddsms.getTemaGPS());
                ddsms.setTemaDomeMvStalk(ddsms.getTemaDomeMvStalk());
                ddsms.setTemaCrc(ddsms.getTemaCrc());

                Ddsms ddsmsAlt = ddsmsService.criar(ddsms);
                    return ResponseEntity.ok(ddsmsAlt);
            })
            .orElse(ResponseEntity.notFound().build());
        
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable Long id) {
        if (ddsmsService.buscar(id).isPresent()) {
            ddsmsService.excluir(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }

}
