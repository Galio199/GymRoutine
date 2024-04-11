package Entornos.GymRoutine.servicio.Interfaces;

import Entornos.GymRoutine.DTO.MembresiaDTO;
import Entornos.GymRoutine.modelo.Membresia;

import java.util.List;

public interface IMembresiaServicio {

    List<Membresia> listarMembresias();

    MembresiaDTO nuevaMembresia(Membresia membresia);

    int borrarMembresia(Long id);

}
