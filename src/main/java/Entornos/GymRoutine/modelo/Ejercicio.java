package Entornos.GymRoutine.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 *
 * @author juand
 */
@Entity
@Table(name = Ejercicio.TABLE_NAME)
public class Ejercicio {

    public static final String TABLE_NAME = "ejercicios";

    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombre;
    @ManyToOne
    @JoinColumn(name = "id_dificultad_ejercicio")
    private DificultadEjercicio idDificultadEjercicio;
    @ManyToOne
    @JoinColumn(name = "id_tipo_ejercicio")
    private TipoEjercicio idTipoEjercicio;

    //Contructores
    public Ejercicio() {
    }

    public Ejercicio(long id, String nombre, DificultadEjercicio idDificultadEjercicio, TipoEjercicio idTipoEjercicio) {
        this.id = id;
        this.nombre = nombre;
        this.idDificultadEjercicio = idDificultadEjercicio;
        this.idTipoEjercicio = idTipoEjercicio;
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

    public DificultadEjercicio getIdDificultadEjercicio() {
        return idDificultadEjercicio;
    }

    public TipoEjercicio getIdTipoEjercicio() {
        return idTipoEjercicio;
    }

    //Setters
    public void setId(long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setIdDificultadEjercicio(DificultadEjercicio idDificultadEjercicio) {
        this.idDificultadEjercicio = idDificultadEjercicio;
    }

    public void setIdTipoEjercicio(TipoEjercicio idTipoEjercicio) {
        this.idTipoEjercicio = idTipoEjercicio;
    }

}
