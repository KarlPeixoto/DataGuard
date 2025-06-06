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

import com.backend.dataguard.domain.EfetivoNoSite;
import com.backend.dataguard.service.EfetivoNoSiteService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/efetivo-no-site")
public class EfetivoNoSiteController {

    @Autowired
    private EfetivoNoSiteService efetivoNoSiteService;

    @GetMapping
    public List<EfetivoNoSite> listar() {
        return efetivoNoSiteService.listar();
    }

    @GetMapping("/{id}")
    public ResponseEntity<EfetivoNoSite> buscar(@PathVariable Long id) {
        return efetivoNoSiteService.buscar(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<EfetivoNoSite> criar(@Valid @RequestBody EfetivoNoSite efetivoNoSite) {
        return ResponseEntity.ok(efetivoNoSiteService.criar(efetivoNoSite));
    }

    @PutMapping("/{id}")
    public ResponseEntity<EfetivoNoSite> atualizar(@PathVariable Long id, @Valid @RequestBody EfetivoNoSite efetivoNoSite) {
        return efetivoNoSiteService.buscar(id)
            .map(efetivoNoSiteExistente -> {
               efetivoNoSite.setTfmc(efetivoNoSite.getTfmc());
               efetivoNoSite.setRhmed(efetivoNoSite.getRhmed());
               efetivoNoSite.setBaseLogistica(efetivoNoSite.getBaseLogistica());
               efetivoNoSite.setDome(efetivoNoSite.getDome());
               efetivoNoSite.setGbj(efetivoNoSite.getGbj());
               efetivoNoSite.setDomeBaseLog(efetivoNoSite.getDomeBaseLog());
               efetivoNoSite.setCrc(efetivoNoSite.getCrc());
               efetivoNoSite.setSunset(efetivoNoSite.getSunset());
               efetivoNoSite.setTeclado(efetivoNoSite.getTeclado());
               efetivoNoSite.setSerimax(efetivoNoSite.getSerimax());
               efetivoNoSite.setPetrobrasCta(efetivoNoSite.getPetrobrasCta());
               efetivoNoSite.setGps(efetivoNoSite.getGps());
               efetivoNoSite.setApplus(efetivoNoSite.getApplus());
               efetivoNoSite.setPetrobrasJomaga(efetivoNoSite.getPetrobrasJomaga()); 

               EfetivoNoSite efetivoNoSiteAlt = efetivoNoSiteService.criar(efetivoNoSite);
               return ResponseEntity.ok(efetivoNoSiteAlt);

            })
            .orElse(ResponseEntity.notFound().build());
        
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable Long id) {
        if (efetivoNoSiteService.buscar(id).isPresent()) {
            efetivoNoSiteService.excluir(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }

}
