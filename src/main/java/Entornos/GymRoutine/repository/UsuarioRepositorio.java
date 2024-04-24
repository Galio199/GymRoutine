package Entornos.GymRoutine.repository;

import Entornos.GymRoutine.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author juand
 */
public interface UsuarioRepositorio extends JpaRepository<Usuario, Long> {
    
    //Buscar un usuario por el nombre de usuario
    @Query("Select u from Usuario as u where u.username =: username")
    Usuario findByUsername(@Param("username") String username);

    //Buscar usuario por nombre
}
