/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entornos.GymRoutine.servicio.Impl;

import Entornos.GymRoutine.DTO.UsuarioCreateDTO;
import Entornos.GymRoutine.modelo.Autorizacion;
import Entornos.GymRoutine.modelo.Usuario;
import Entornos.GymRoutine.repositorio.AutorizacionRepositorio;
import Entornos.GymRoutine.repositorio.UsuarioRepositorio;
import Entornos.GymRoutine.servicio.Interfaces.IUsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 *
 * @author juand
 */
@Service
@Transactional
public class UsuarioServicio implements IUsuarioServicio {
    
    private UsuarioRepositorio usuarioRepositorio;
    private AutorizacionRepositorio autorizacionRepositorio;

    //Crear un nuevo usuario o guardar cambios de uno existente
    @Override
    public Usuario guardarUsuario(UsuarioCreateDTO usuariodto) {
        Usuario usuario = new Usuario();
        Autorizacion autorizacion = new Autorizacion();
        usuario.setUsername(usuariodto.getUsername());
        usuario.setNombre(usuariodto.getNombre());
        usuario.setApellido(usuariodto.getApellido());
        usuario.setFechaCreacion(new Date());
        var usuarioSave = usuarioRepositorio.save(usuario);
        autorizacion.setIdUsuario(usuarioSave.getId());
        autorizacion.setClave(usuariodto.getClave());
        autorizacion.setFechaInicio(new Date());
        autorizacionRepositorio.save(autorizacion);
        return usuarioSave;
    }

    //Buscar un usuario por el nombre de usuario
    @Override
    public Usuario buscarUsuario(String username) {
        Usuario usuarioEncontrado = null;
        usuarioEncontrado = usuarioRepositorio.findByUsername(username);
        return usuarioEncontrado;
    }

    @Override
    public Boolean validarUsuario(String username, String password){
        var auth = autorizacionRepositorio.findAuth(username, password);
        if(auth == null){
            throw new RuntimeException("Usuario o contraseña erronea" );
        }
        return true;
    }

    @Override
    public Boolean borrarUsuario(Long id) {
        usuarioRepositorio.deleteById(id);
        return true;
    }

    @Autowired
    public void setUsuarioRepositorio(UsuarioRepositorio usuarioRepositorio) {
        this.usuarioRepositorio = usuarioRepositorio;
    }

    @Autowired
    public void setAutorizacionRepositorio(AutorizacionRepositorio autorizacionRepositorio) {
        this.autorizacionRepositorio = autorizacionRepositorio;
    }
}
