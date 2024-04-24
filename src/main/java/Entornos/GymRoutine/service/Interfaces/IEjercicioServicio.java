package Entornos.GymRoutine.service.Interfaces;

import Entornos.GymRoutine.model.Ejercicio;
import java.util.List;

/**
 *
 * @author juand
 */
public interface IEjercicioServicio {

    List<Ejercicio> listarEjercicios(Long idTipoEjercicio, Long idDificultadEjercicio);
}
