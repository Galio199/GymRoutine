package Entornos.GymRoutine.servicio.Interfaces;

import Entornos.GymRoutine.modelo.DificultadEjercicio;
import java.util.List;

/**
 *
 * @author juand
 */
public interface IDificultadEjercicioServicio {

    List<DificultadEjercicio> listarDificultades();

    DificultadEjercicio buscarDificultadPorId(Long id);
}
