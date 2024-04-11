package Entornos.GymRoutine.repositorio;

import Entornos.GymRoutine.modelo.Membresia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 *
 * @author juand
 */
public interface MembresiaRepositorio extends JpaRepository<Membresia, Long> {
    @Query(value = "SELECT * FROM membresia WHERE id_usuario = :idUsuario", nativeQuery = true)
    List<Membresia> findByIdUsuario(Long idUsuario);
}
