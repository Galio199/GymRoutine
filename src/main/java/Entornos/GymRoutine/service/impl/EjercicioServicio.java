package Entornos.GymRoutine.service.impl;

import Entornos.GymRoutine.model.Ejercicio;
import Entornos.GymRoutine.repository.EjercicioRepositorio;
import Entornos.GymRoutine.service.Interfaces.IEjercicioServicio;
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
public class EjercicioServicio implements IEjercicioServicio{
    
    @Autowired
    EjercicioRepositorio ejercicioRepositorio;

    @Override
    public List<Ejercicio> listarEjercicios(Long idTipoEjercicio, Long idDificultadEjercicio) {
        return ejercicioRepositorio.findByTipoYDificultad(idTipoEjercicio, idDificultadEjercicio);
    }
    
}