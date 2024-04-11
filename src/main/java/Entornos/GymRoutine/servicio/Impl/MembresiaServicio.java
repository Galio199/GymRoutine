package Entornos.GymRoutine.servicio.Impl;

import Entornos.GymRoutine.DTO.MembresiaDTO;
import Entornos.GymRoutine.modelo.Membresia;
import Entornos.GymRoutine.repositorio.MembresiaRepositorio;
import Entornos.GymRoutine.servicio.Interfaces.IMembresiaServicio;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class MembresiaServicio implements IMembresiaServicio {

    MembresiaRepositorio membresiaRepositorio;

    @Override
    public List<Membresia> listarMembresias() {
        return membresiaRepositorio.findAll();
    }

    @Override
    public MembresiaDTO nuevaMembresia(Membresia membresia) {
        Membresia membresiaSave = membresiaRepositorio.save(membresia);
        MembresiaDTO membresiaReturn = new MembresiaDTO();
        membresiaReturn.setFechaFin(membresiaSave.getFechaFin());
        membresiaReturn.setFechaInicio(membresiaSave.getFechaInicio());
        membresiaReturn.setIdUsuario(membresiaSave.getId());
        membresiaReturn.setUsername(membresiaSave.getUsuario().getUsername());
        return membresiaReturn;
    }

    @Override
    public int borrarMembresia(Long id) {
        membresiaRepositorio.deleteById(id);
        return 1;
    }
}
