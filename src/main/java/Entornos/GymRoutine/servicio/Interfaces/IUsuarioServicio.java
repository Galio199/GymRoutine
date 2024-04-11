/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Entornos.GymRoutine.servicio.Interfaces;

import Entornos.GymRoutine.modelo.Usuario;

/**
 *
 * @author juand
 */
public interface IUsuarioServicio {

    Usuario guardarUsuario(Usuario usuario);

    Boolean borrarUsuario(Long id);
    
    Usuario buscarUsuario(String username);

    Boolean validarUsuario(String username, String password);

}
