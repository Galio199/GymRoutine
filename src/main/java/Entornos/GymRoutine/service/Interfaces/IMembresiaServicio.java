package Entornos.GymRoutine.service.Interfaces;

import Entornos.GymRoutine.model.Membresia;

import java.util.List;

public interface IMembresiaServicio {

    List<Membresia> listarMembresiasByIdUsario(Long idUsario);

    Membresia nuevaMembresia(Membresia membresia);

    Membresia buscarMembresia(Long id);

    int borrarMembresia(Long id);

}
