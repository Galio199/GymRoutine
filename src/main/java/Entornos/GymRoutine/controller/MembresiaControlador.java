package Entornos.GymRoutine.controller;


import Entornos.GymRoutine.model.Membresia;
import Entornos.GymRoutine.service.impl.MembresiaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/membresia")

public class MembresiaControlador {

    @Autowired
    MembresiaServicio membresiaServicio;

    @PostMapping("/")
    public ResponseEntity<Membresia> agregar (@RequestBody  Membresia membresia){
        Membresia obj = membresiaServicio.nuevaMembresia(membresia);
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }

    @GetMapping("/list/{idUser}")
    public List<Membresia> listarMembresiasByIdUsario(@PathVariable Long idUser){
        return membresiaServicio.listarMembresiasByIdUsario(idUser);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Membresia> eliminar(@PathVariable Long id){
        Membresia obj = membresiaServicio.buscarMembresia(id);
        if(obj != null){
            membresiaServicio.borrarMembresia(id);
        }else {
            return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }
}