package Entornos.GymRoutine.service.Interfaces;

import Entornos.GymRoutine.model.DificultadEjercicio;
import java.util.List;

/**
 *
 * @author juand
 */
public interface IDificultadEjercicioServicio {

    List<DificultadEjercicio> listarDificultades();

    DificultadEjercicio buscarDificultadPorId(Long id);
}
