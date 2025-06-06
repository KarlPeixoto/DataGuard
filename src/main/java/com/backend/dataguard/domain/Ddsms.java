package com.backend.dataguard.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ddsms")
public class Ddsms {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private String temaMecanica;

    private String temaSerimax;

    private String temaBaseLogistica;

    private String temaEletrica;

    private String temaApplusQualitec;

    private String temaDomeBaseLog;

    private String temaDomeFiringLine;

    private String temaApplusRtd;

    private String temaTeclado;

    private String temaDomeMvArmz;

    private String temaGBJ;

    private String temaGPS;

    private String temaDomeMvStalk;

    private String temaCrc;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTemaMecanica() {
        return temaMecanica;
    }

    public void setTemaMecanica(String temaMecanica) {
        this.temaMecanica = temaMecanica;
    }

    public String getTemaSerimax() {
        return temaSerimax;
    }

    public void setTemaSerimax(String temaSerimax) {
        this.temaSerimax = temaSerimax;
    }

    public String getTemaBaseLogistica() {
        return temaBaseLogistica;
    }

    public void setTemaBaseLogistica(String temaBaseLogistica) {
        this.temaBaseLogistica = temaBaseLogistica;
    }

    public String getTemaEletrica() {
        return temaEletrica;
    }

    public void setTemaEletrica(String temaEletrica) {
        this.temaEletrica = temaEletrica;
    }

    public String getTemaApplusQualitec() {
        return temaApplusQualitec;
    }

    public void setTemaApplusQualitec(String temaApplusQualitec) {
        this.temaApplusQualitec = temaApplusQualitec;
    }

    public String getTemaDomeBaseLog() {
        return temaDomeBaseLog;
    }

    public void setTemaDomeBaseLog(String temaDomeBaseLog) {
        this.temaDomeBaseLog = temaDomeBaseLog;
    }

    public String getTemaDomeFiringLine() {
        return temaDomeFiringLine;
    }

    public void setTemaDomeFiringLine(String temaDomeFiringLine) {
        this.temaDomeFiringLine = temaDomeFiringLine;
    }

    public String getTemaApplusRtd() {
        return temaApplusRtd;
    }

    public void setTemaApplusRtd(String temaApplusRtd) {
        this.temaApplusRtd = temaApplusRtd;
    }

    public String getTemaTeclado() {
        return temaTeclado;
    }

    public void setTemaTeclado(String temaTeclado) {
        this.temaTeclado = temaTeclado;
    }

    public String getTemaDomeMvArmz() {
        return temaDomeMvArmz;
    }

    public void setTemaDomeMvArmz(String temaDomeMvArmz) {
        this.temaDomeMvArmz = temaDomeMvArmz;
    }

    public String getTemaGBJ() {
        return temaGBJ;
    }

    public void setTemaGBJ(String temaGBJ) {
        this.temaGBJ = temaGBJ;
    }

    public String getTemaGPS() {
        return temaGPS;
    }

    public void setTemaGPS(String temaGPS) {
        this.temaGPS = temaGPS;
    }

    public String getTemaDomeMvStalk() {
        return temaDomeMvStalk;
    }

    public void setTemaDomeMvStalk(String temaDomeMvStalk) {
        this.temaDomeMvStalk = temaDomeMvStalk;
    }

    public String getTemaCrc() {
        return temaCrc;
    }

    public void setTemaCrc(String temaCrc) {
        this.temaCrc = temaCrc;
    }

    
}
