package Entornos.GymRoutine.servicio.Interfaces;

import Entornos.GymRoutine.modelo.Ejercicio;
import java.util.List;

/**
 *
 * @author juand
 */
public interface IEjercicioServicio {
    
    List<Ejercicio> listarEjercicios();
    
    List<Ejercicio> filtrarEjercicios(Long idTipoEjercicio, Long idDificultadEjercicio);
}