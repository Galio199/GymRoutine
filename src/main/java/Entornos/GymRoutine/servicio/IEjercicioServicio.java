/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Entornos.GymRoutine.servicio;

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
