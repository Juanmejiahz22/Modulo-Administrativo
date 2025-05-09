package com.bienestar.admin.service;

import com.bienestar.admin.model.Usuario;
import com.bienestar.admin.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario autenticar(String correo, String contraseña) {
        return usuarioRepository.findByCorreoAndContraseña(correo, contraseña)
                .orElseThrow(() -> new RuntimeException("Credenciales inválidas"));
    }

    public Usuario obtenerPorId(Long id) {
        return usuarioRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado"));
    }
}