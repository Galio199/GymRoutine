package Entornos.GymRoutine.controller;

import Entornos.GymRoutine.model.DificultadEjercicio;
import Entornos.GymRoutine.service.impl.DificultadEjercicioServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author juand
 */
@RestController
@CrossOrigin("*")
@RequestMapping("/api/dificultadejercicios")
public class DificultadEjercicioControlador {

    @Autowired
    DificultadEjercicioServicio dificultadEjercicioServicio;

    //Listar dificultades
    @GetMapping("/list")
    public List<DificultadEjercicio> listarDificultades() {
        return dificultadEjercicioServicio.listarDificultades();
    }

    //Buscar una dificultad por id
    @GetMapping("/list/{id}")
    public DificultadEjercicio buscarPorId(@PathVariable Long id) {
        return dificultadEjercicioServicio.buscarDificultadPorId(id);
    }
}
