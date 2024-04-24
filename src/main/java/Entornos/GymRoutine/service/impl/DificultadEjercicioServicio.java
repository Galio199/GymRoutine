package Entornos.GymRoutine.service.impl;

import Entornos.GymRoutine.model.DificultadEjercicio;
import Entornos.GymRoutine.repository.DificultadEjercicioRepositorio;
import Entornos.GymRoutine.service.Interfaces.IDificultadEjercicioServicio;
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
