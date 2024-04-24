/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Entornos.GymRoutine.service.Interfaces;

import Entornos.GymRoutine.DTO.UsuarioCreateDTO;
import Entornos.GymRoutine.model.Usuario;

/**
 *
 * @author juand
 */
public interface IUsuarioServicio {

    Usuario guardarUsuario(UsuarioCreateDTO usuario);

    Boolean borrarUsuario(Long id);
    
    Usuario buscarUsuario(String username);

    Boolean validarUsuario(String username, String password);

}
