package Entornos.GymRoutine.servicio.Interfaces;

import Entornos.GymRoutine.modelo.TipoEjercicio;
import java.util.List;

/**
 *
 * @author juand
 */
public interface ITipoEjericioServicio {

    List<TipoEjercicio> listarTipos();

    TipoEjercicio buscarTipoPorId(Long id);

}
