/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entornos.GymRoutine.service.impl;

import Entornos.GymRoutine.model.TipoEjercicio;
import Entornos.GymRoutine.repository.TipoEjercicioRepositorio;
import Entornos.GymRoutine.service.Interfaces.ITipoEjericioServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author juand
 */
@Service
@Transactional
public class TipoEjercicioServicio implements ITipoEjericioServicio {
    
    @Autowired
    TipoEjercicioRepositorio tipoEjercicioRepositorio;
    
    @Override
    public List<TipoEjercicio> listarTipos() {
        return tipoEjercicioRepositorio.findAll();
    }
    
    @Override
    public TipoEjercicio buscarTipoPorId(Long id) {
        return tipoEjercicioRepositorio.findById(id).orElse(null);
    }
    
}
