package Entornos.GymRoutine.servicio.Impl;

import Entornos.GymRoutine.modelo.DificultadEjercicio;
import Entornos.GymRoutine.repositorio.DificultadEjercicioRepositorio;
import Entornos.GymRoutine.servicio.Interfaces.IDificultadEjercicioServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author juand
 */
@Service
@Transactional
public class DificultadEjercicioServicio implements IDificultadEjercicioServicio {

    @Autowired
    DificultadEjercicioRepositorio dificultadEjercicioRepositorio;

    @Override
    public List<DificultadEjercicio> listarDificultades() {
        return dificultadEjercicioRepositorio.findAll();
    }

    @Override
    public DificultadEjercicio buscarDificultadPorId(Long id) {
        return dificultadEjercicioRepositorio.findById(id).orElse(null);
    }
}
