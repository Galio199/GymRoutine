/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entornos.GymRoutine.servicio;

import Entornos.GymRoutine.modelo.Usuario;
import Entornos.GymRoutine.repositorio.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author juand
 */
@Service
@Transactional
public class UsuarioServicio implements IUsuarioServicio{
    
    @Autowired
    UsuarioRepositorio usuarioRepositorio;

    //Crear un nuevo usuario o guardar cambios de uno existente
    @Override
    public Usuario guardarUsuario(Usuario usuario) {
        return usuarioRepositorio.save(usuario);
    }

    //Buscar un usuario por el nombre de usuario
    @Override
    public Usuario buscarUsuario(String username) {
        Usuario usuarioEncontrado = null;
        usuarioEncontrado = usuarioRepositorio.findByUsername(username);
        return usuarioEncontrado;
    }

    @Override
    public boolean borrarUsuario(Long id) {
        usuarioRepositorio.deleteById(id);
        return true;
    }
    
}
