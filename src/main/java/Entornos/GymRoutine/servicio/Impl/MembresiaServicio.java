package Entornos.GymRoutine.servicio.Impl;

import Entornos.GymRoutine.modelo.Membresia;
import Entornos.GymRoutine.repositorio.MembresiaRepositorio;
import Entornos.GymRoutine.servicio.Interfaces.IMembresiaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class MembresiaServicio implements IMembresiaServicio {

    @Autowired
    MembresiaRepositorio membresiaRepositorio;

    @Override
    public List<Membresia> listarMembresiasByIdUsario(Long IdUsario) {
        return (List<Membresia>) membresiaRepositorio.findByIdUsuario(IdUsario);
    }

    @Override
    public Membresia nuevaMembresia(Membresia membresia) {
        System.out.println(membresia);
        return membresiaRepositorio.save(membresia);
    }

    @Override
    public int borrarMembresia(Long id) {
        membresiaRepositorio.deleteById(id);
        return 1;
    }
}
