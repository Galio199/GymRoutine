package Entornos.GymRoutine.controlador;

import Entornos.GymRoutine.modelo.Ejercicio;
import Entornos.GymRoutine.servicio.Impl.EjercicioServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<List<Ejercicio>> listarEjerciciosConFiltro(
            @RequestParam(value = "idTipoEjercicio", required = false) Long idTipoEjercicio, 
            @RequestParam(value = "idDificultadEjercicio", required = false) Long idDificultadEjercicio){
        List<Ejercicio> list = ejercicioServicio.listarEjercicios(idTipoEjercicio, idDificultadEjercicio);
        return new ResponseEntity(list, HttpStatus.OK);
    }
    
}