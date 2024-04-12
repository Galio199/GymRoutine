package Entornos.GymRoutine.repositorio;

import Entornos.GymRoutine.modelo.Autorizacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author juand
 */
@Repository
public interface AutorizacionRepositorio extends JpaRepository<Autorizacion, Long> {

    @Query("SELECT a FROM Autorizacion a " +
            "WHERE a.usuario.username = :username " +
            "and a.clave = :password")
    Autorizacion findAuth(String username, String password);
}
