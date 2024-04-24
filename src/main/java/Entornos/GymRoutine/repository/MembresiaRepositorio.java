package Entornos.GymRoutine.repository;

import Entornos.GymRoutine.model.Membresia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 *
 * @author juand
 */
@Repository
public interface MembresiaRepositorio extends JpaRepository<Membresia, Long> {
    @Query(value = "SELECT * FROM membresia WHERE id_usuario = :idUsuario", nativeQuery = true)
    List<Membresia> findByIdUsuario(Long idUsuario);
}
