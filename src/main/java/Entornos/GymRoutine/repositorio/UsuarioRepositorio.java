package Entornos.GymRoutine.repositorio;

import Entornos.GymRoutine.modelo.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author juand
 */
public interface UsuarioRepositorio extends JpaRepository<Usuario, Long> {
    
}
