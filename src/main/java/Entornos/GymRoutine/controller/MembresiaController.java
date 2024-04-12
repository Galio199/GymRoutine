package Entornos.GymRoutine.controller;


import Entornos.GymRoutine.DTO.MembresiaDTO;
import Entornos.GymRoutine.modelo.Membresia;
import Entornos.GymRoutine.servicio.Impl.MembresiaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/membresia")

public class MembresiaController {

    @Autowired
    MembresiaServicio membresiaServicio;

    @PostMapping("/")
    public ResponseEntity<MembresiaDTO> agregar (@RequestBody  Membresia membresia){
        MembresiaDTO obj = membresiaServicio.nuevaMembresia(membresia);
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
