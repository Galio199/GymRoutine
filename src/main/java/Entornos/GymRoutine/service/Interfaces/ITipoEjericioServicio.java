package Entornos.GymRoutine.service.Interfaces;

import Entornos.GymRoutine.model.TipoEjercicio;
import java.util.List;

/**
 *
 * @author juand
 */
public interface ITipoEjericioServicio {

    List<TipoEjercicio> listarTipos();

    TipoEjercicio buscarTipoPorId(Long id);

}
