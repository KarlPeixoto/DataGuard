package com.backend.dataguard.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="efetivo_no_site")
public class EfetivoNoSite {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private Integer Tfmc;
    private Integer Rhmed;
    private Integer BaseLogistica;
    private Integer Dome;
    private Integer Gbj;
    private Integer DomeBaseLog;
    private Integer Crc;
    private Integer Sunset;
    private Integer Teclado;
    private Integer Serimax;
    private Integer PetrobrasCta;
    private Integer Gps;
    private Integer Applus;
    private Integer PetrobrasJomaga;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Integer getTfmc() {
        return Tfmc;
    }
    public void setTfmc(Integer tfmc) {
        Tfmc = tfmc;
    }
    public Integer getRhmed() {
        return Rhmed;
    }
    public void setRhmed(Integer rhmed) {
        Rhmed = rhmed;
    }
    public Integer getBaseLogistica() {
        return BaseLogistica;
    }
    public void setBaseLogistica(Integer baseLogistica) {
        BaseLogistica = baseLogistica;
    }
    public Integer getDome() {
        return Dome;
    }
    public void setDome(Integer dome) {
        Dome = dome;
    }
    public Integer getGbj() {
        return Gbj;
    }
    public void setGbj(Integer gbj) {
        Gbj = gbj;
    }
    public Integer getDomeBaseLog() {
        return DomeBaseLog;
    }
    public void setDomeBaseLog(Integer domeBaseLog) {
        DomeBaseLog = domeBaseLog;
    }
    public Integer getCrc() {
        return Crc;
    }
    public void setCrc(Integer crc) {
        Crc = crc;
    }
    public Integer getSunset() {
        return Sunset;
    }
    public void setSunset(Integer sunset) {
        Sunset = sunset;
    }
    public Integer getTeclado() {
        return Teclado;
    }
    public void setTeclado(Integer teclado) {
        Teclado = teclado;
    }
    public Integer getSerimax() {
        return Serimax;
    }
    public void setSerimax(Integer serimax) {
        Serimax = serimax;
    }
    public Integer getPetrobrasCta() {
        return PetrobrasCta;
    }
    public void setPetrobrasCta(Integer petrobrasCta) {
        PetrobrasCta = petrobrasCta;
    }
    public Integer getGps() {
        return Gps;
    }
    public void setGps(Integer gps) {
        Gps = gps;
    }
    public Integer getApplus() {
        return Applus;
    }
    public void setApplus(Integer applus) {
        Applus = applus;
    }
    public Integer getPetrobrasJomaga() {
        return PetrobrasJomaga;
    }
    public void setPetrobrasJomaga(Integer petrobrasJomaga) {
        PetrobrasJomaga = petrobrasJomaga;
    }

    
}
