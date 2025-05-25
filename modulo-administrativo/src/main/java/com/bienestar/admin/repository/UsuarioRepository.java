package com.bienestar.admin.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bienestar.admin.model.Usuario;

public interface UsuarioRepository extends MongoRepository<Usuario, String> {


    Optional<Usuario> findByCorreoAndContrasena(String correo, String contrasena);

    Optional<Usuario> findByCorreo(String correo);

    List<Usuario> findByRol(String rol);

    List<Usuario> findByNombreCompletoContainingIgnoreCase(String nombre);
}
