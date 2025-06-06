package com.backend.dataguard.domain;

import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="turnos")
public class Turno {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional=false)
    @JoinColumn(name="usuario_id")
    private Usuario usuario;

    @Enumerated(EnumType.STRING)
    @Column(nullable=false)
    private PeriodoTurno periodo;
    
    
    private String horaEntrada;
    
    
    private String horaSaida;

    @Column(nullable=false)
    private LocalDate data;

        
    @Column(length = 2000)
    private String observacoesSeguranca;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ddsms_id", referencedColumnName = "id")
    private Ddsms ddsms;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "efetivo_no_site_id", referencedColumnName = "id")
    private EfetivoNoSite efetivoNoSite;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public PeriodoTurno getPeriodo() {
        return periodo;
    }

    public void setPeriodo(PeriodoTurno periodo) {
        this.periodo = periodo;
    }

    public String getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(String horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public String getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(String horaSaida) {
        this.horaSaida = horaSaida;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getObservacoesSeguranca() {
        return observacoesSeguranca;
    }

    public void setObservacoesSeguranca(String observacoesSeguranca) {
        this.observacoesSeguranca = observacoesSeguranca;
    }

    public Ddsms getDdsms() {
        return ddsms;
    }

    public void setDdsms(Ddsms ddsms) {
        this.ddsms = ddsms;
    }

    public EfetivoNoSite getEfetivoNoSite() {
        return efetivoNoSite;
    }

    public void setEfetivoNoSite(EfetivoNoSite efetivoNoSite) {
        this.efetivoNoSite = efetivoNoSite;
    }

    
}
