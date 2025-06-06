package com.backend.dataguard.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.backend.dataguard.domain.Usuario;
import com.backend.dataguard.repository.UsuarioRepository;

@Service
public class UsuarioService {

    @Autowired
    public UsuarioRepository usuarioRepository;

     @Autowired
    private PasswordEncoder passwordEncoder;

    public List<Usuario> listar() {
        return usuarioRepository.findAll();
    }

    public Optional<Usuario> buscar(Long id) {
        return usuarioRepository.findById(id);
    }

    public Usuario criar(Usuario usuario) {
    if (usuario.getRole() == null || usuario.getRole().isBlank()) {
        usuario.setRole("FUNCIONARIO");
    }
    usuario.setSenhaHash(passwordEncoder.encode(usuario.getSenhaHash()));
    return usuarioRepository.save(usuario);
}

    public void excluir(Long id) {
        usuarioRepository.deleteById(id);
    }

   public Usuario salvar(Usuario usuario) {
    usuario.setSenhaHash(passwordEncoder.encode(usuario.getSenhaHash()));
    return usuarioRepository.save(usuario);
}
}
