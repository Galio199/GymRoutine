package Entornos.GymRoutine.servicio.Interfaces;

import Entornos.GymRoutine.modelo.Membresia;

import java.util.List;

public interface IMembresiaServicio {

    List<Membresia> listarMembresias();

    Membresia nuevaMembresia(Membresia membresia);

    int borrarMembresia(Long id);

}
