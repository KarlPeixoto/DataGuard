package com.backend.dataguard.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

@Entity
@Table(name="usuarios")
public class Usuario {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    @NotBlank(message = "O nome do cliente não pode estar vazio")
    @Pattern(regexp = "^[A-Za-zÀ-ÿ\\s]+$", message = "Nome inválido")
    private String nome;

    @Column(nullable = false)
    @NotBlank(message = "O email do cliente não pode estar vazio")
    @Pattern(regexp = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$", message = "Email inválido")
    private String email;

    @Column(nullable = false)
    @NotBlank(message = "A senha do cliente não pode estar vazia")
    @Pattern(regexp="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=\\S+$).{8,}$", message = "Senha inválida")
    private String senhaHash;

    private String role; // "FUNCIONARIO" ou "GERENTE"

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenhaHash() {
        return senhaHash;
    }

    public void setSenhaHash(String senhaHash) {
        this.senhaHash = senhaHash;
    }

    public Usuario() {
    }

    
    public Usuario(Long id,
            @NotBlank(message = "O nome do cliente não pode estar vazio") @Pattern(regexp = "^[A-Za-zÀ-ÿ\\s]+$", message = "Nome inválido") String nome,
            @NotBlank(message = "O email do cliente não pode estar vazio") @Pattern(regexp = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$", message = "Email inválido") String email,
            @NotBlank(message = "A senha do cliente não pode estar vazia") @Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=\\S+$).{8,}$", message = "Senha inválida") String senhaHash,
            String role) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senhaHash = senhaHash;
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    

}