package Entornos.GymRoutine.controller;


import Entornos.GymRoutine.modelo.Membresia;
import Entornos.GymRoutine.servicio.Impl.MembresiaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/membresia")

public class MembresiaController {

    @Autowired
    MembresiaServicio membresiaServicio;

    @PostMapping("/")
    public ResponseEntity<Membresia> agregar (@RequestBody  Membresia membresia){
        Membresia obj = membresiaServicio.nuevaMembresia(membresia);
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }

}
