package Entornos.GymRoutine.repositorio;

import Entornos.GymRoutine.modelo.Ejercicio;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author juand
 */
public interface EjercicioRepositorio extends JpaRepository<Ejercicio, Long> {

    //Listar los ejercicios ordenados por dificultad
    @Query("SELECT e FROM ejercicios as e ORDER BY e.id_dificultad_ejercicio")
    List<Ejercicio> findAllOrdenadoPorDificultad();
    
    //Filtrar ejercicios
    @Query("SELECT e FROM ejercicios e "
            + "WHERE (e.id_tipo_ejercicio = :idTipoEjercicio OR :idTipoEjercicio IS NULL) "
            + "AND (e.id_dificultad_ejercicio = :idDificultadEjercicio OR :idDificultadEjercicio IS NULL)")
    List<Ejercicio> findByTipoYDificultad(Long idTipoEjercicio, Long idDificultadEjercicio);
}
