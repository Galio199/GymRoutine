package Entornos.GymRoutine.controller;

import Entornos.GymRoutine.service.Interfaces.IUsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AutorizacionControlador {
    private IUsuarioServicio usuarioServicio;

    @GetMapping("/")
    public ResponseEntity<Boolean> auth(@RequestParam(value = "username") String username,
                                        @RequestParam(value = "password") String password){
        return new ResponseEntity<>(usuarioServicio.validarUsuario(username, password), HttpStatus.OK);
    }

    @Autowired
    public void setUsuarioServicio(IUsuarioServicio usuarioServicio) {
        this.usuarioServicio = usuarioServicio;
    }
}
