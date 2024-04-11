/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entornos.GymRoutine.servicio;

import Entornos.GymRoutine.modelo.Ejercicio;
import Entornos.GymRoutine.repositorio.EjercicioRepositorio;
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
    public List<Ejercicio> listarEjercicios() {
        return ejercicioRepositorio.findAllOrdenadoPorDificultad();
    }

    @Override
    public List<Ejercicio> filtrarEjercicios(Long idTipoEjercicio, Long idDificultadEjercicio) {
        return ejercicioRepositorio.findByTipoYDificultad(idTipoEjercicio, idDificultadEjercicio);
    }
    
}