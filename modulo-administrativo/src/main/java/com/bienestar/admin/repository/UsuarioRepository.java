package com.bienestar.admin.repository;

import com.bienestar.admin.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findByCorreoAndContraseña(String correo, String contraseña);
}