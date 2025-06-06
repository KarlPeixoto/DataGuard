package com.backend.dataguard.controller;

import com.backend.dataguard.config.JwtUtil;
import com.backend.dataguard.domain.Usuario;
import com.backend.dataguard.dto.Login;
import com.backend.dataguard.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private JwtUtil jwtUtil;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody Login login) {
        System.out.println("Tentativa de login: " + login.getEmail());
        Usuario usuario = usuarioRepository.findAll().stream()
                .filter(u -> u.getEmail().equals(login.getEmail()))
                .findFirst()
                .orElse(null);

        if (usuario != null && passwordEncoder.matches(login.getSenha(), usuario.getSenhaHash())) {
    String token = jwtUtil.generateToken(usuario.getEmail(), usuario.getRole().replace("ROLE_", ""));
    return ResponseEntity.ok().body(token);
}
        return ResponseEntity.status(401).body("Credenciais inválidas");
    }

}
