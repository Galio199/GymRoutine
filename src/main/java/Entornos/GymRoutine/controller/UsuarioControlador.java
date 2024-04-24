package Entornos.GymRoutine.controller;

import Entornos.GymRoutine.DTO.UsuarioCreateDTO;
import Entornos.GymRoutine.model.Usuario;
import Entornos.GymRoutine.service.Interfaces.IUsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioControlador {

    IUsuarioServicio usuarioServicio;

    @PostMapping("/")
    public ResponseEntity<Usuario> createUsuario(@RequestBody UsuarioCreateDTO usuario){
        return new ResponseEntity<>(usuarioServicio.guardarUsuario(usuario), HttpStatus.OK);
    }

    @Autowired
    public void setUsuarioServicio(IUsuarioServicio usuarioServicio) {
        this.usuarioServicio = usuarioServicio;
    }
}
