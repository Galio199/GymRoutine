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
@Table(name = DiaSemana.TABLE_NAME)
public class DiaSemana {

    public static final String TABLE_NAME = "dias_semana";

    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int orden;
    private String nombre;

    //Constructores
    public DiaSemana() {
    }

    public DiaSemana(long id, int orden, String nombre) {
        this.id = id;
        this.orden = orden;
        this.nombre = nombre;
    }

    //Getters
    public static String getTABLE_NAME() {
        return TABLE_NAME;
    }

    public long getId() {
        return id;
    }

    public int getOrden() {
        return orden;
    }

    public String getNombre() {
        return nombre;
    }

    //Setters
    public void setId(long id) {
        this.id = id;
    }

    public void setOrden(int orden) {
        this.orden = orden;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
