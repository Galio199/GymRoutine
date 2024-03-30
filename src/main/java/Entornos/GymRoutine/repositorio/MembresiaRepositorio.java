package Entornos.GymRoutine.repositorio;

import Entornos.GymRoutine.modelo.Membresia;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author juand
 */
public interface MembresiaRepositorio extends JpaRepository<Membresia, Long> {
    
}
