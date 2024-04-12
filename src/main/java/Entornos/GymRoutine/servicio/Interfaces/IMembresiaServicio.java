package Entornos.GymRoutine.servicio.Interfaces;

import Entornos.GymRoutine.DTO.MembresiaDTO;
import Entornos.GymRoutine.modelo.Membresia;

import java.util.List;

public interface IMembresiaServicio {

    List<Membresia> listarMembresiasByIdUsario(Long idUsario);

    MembresiaDTO nuevaMembresia(Membresia membresia);

    Membresia buscarMembresia(Long id);

    int borrarMembresia(Long id);

}
