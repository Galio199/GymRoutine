package Entornos.GymRoutine.controller;

import Entornos.GymRoutine.model.Ejercicio;
import Entornos.GymRoutine.service.impl.EjercicioServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author juand
 */
@RestController
@CrossOrigin("*")
@RequestMapping("/api/ejercicios")
public class EjercicioControlador {

    @Autowired
    EjercicioServicio ejercicioServicio;

    //Listar ejercicios 
    @GetMapping("/list")
    public List<Ejercicio> listarEjerciciosConFiltro(
            @RequestParam(value = "idTipoEjercicio", required = false) Long idTipoEjercicio,
            @RequestParam(value = "idDificultadEjercicio", required = false) Long idDificultadEjercicio) {
        return ejercicioServicio.listarEjercicios(idTipoEjercicio, idDificultadEjercicio);
    }
}
