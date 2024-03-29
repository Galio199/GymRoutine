package Entornos.GymRoutine.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 *
 * @author juand
 */
@Entity
@Table(name = DificultadEjercicio.TABLE_NAME)
public class DificultadEjercicio {

    public static final String TABLE_NAME = "dificultades_ejercicio";

    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombre;

    //Constructores
    public DificultadEjercicio() {
    }

    public DificultadEjercicio(long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    //Getters
    public static String getTABLE_NAME() {
        return TABLE_NAME;
    }

    public long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    //Setters
    public void setId(long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
