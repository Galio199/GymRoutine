package Entornos.GymRoutine.servicio.Interfaces;

import Entornos.GymRoutine.modelo.Membresia;

import java.util.List;

public interface IMembresiaServicio {

    List<Membresia> listarMembresiasByIdUsario(Long idUsario);

    Membresia nuevaMembresia(Membresia membresia);

    int borrarMembresia(Long id);

}
