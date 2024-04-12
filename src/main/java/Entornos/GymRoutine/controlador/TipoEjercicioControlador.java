/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entornos.GymRoutine.controlador;

import Entornos.GymRoutine.modelo.TipoEjercicio;
import Entornos.GymRoutine.servicio.Impl.TipoEjercicioServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author juand
 */
@RestController
@CrossOrigin("*")
@RequestMapping("/api/tipoEjercicio")
public class TipoEjercicioControlador {
    
    @Autowired
    TipoEjercicioServicio tipoEjercicioServicio;
    
    //Listar los tipos
    @GetMapping("/list")
    public List<TipoEjercicio> listarTipos(){
        return tipoEjercicioServicio.listarTipos();
    }
    
    //Buscar un tipo por id
    @GetMapping("/list/{id}")
    public TipoEjercicio buscarPorId(@PathVariable Long id){
        return tipoEjercicioServicio.buscarTipoPorId(id);
    }
}
