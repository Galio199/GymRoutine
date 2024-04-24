package Entornos.GymRoutine.repository;

import Entornos.GymRoutine.model.Ejercicio;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author juand
 */
@Repository
public interface EjercicioRepositorio extends JpaRepository<Ejercicio, Long> {

    //Listar los ejercicios ordenados por dificultad
    @Query("SELECT e FROM Ejercicio as e ORDER BY e.idDificultad")
    List<Ejercicio> findAllOrdenadoPorDificultad();
    
    //Filtrar ejercicios
    @Query("SELECT e FROM Ejercicio e "
            + "WHERE (e.idTipoEjercicio = :idTipoEjercicio OR :idTipoEjercicio IS NULL) "
            + "AND (e.idDificultad = :idDificultadEjercicio OR :idDificultadEjercicio IS NULL)")
    List<Ejercicio> findByTipoYDificultad(Long idTipoEjercicio, Long idDificultadEjercicio);

}
