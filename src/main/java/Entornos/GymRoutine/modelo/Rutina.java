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
@Table(name = Rutina.TABLE_NAME)
public class Rutina {

    public static final String TABLE_NAME = "rutina";

    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombre;
    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario idUsuario;

    //Constructores
    public Rutina() {
    }

    public Rutina(long id, String nombre, Usuario idUsuario) {
        this.id = id;
        this.nombre = nombre;
        this.idUsuario = idUsuario;
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

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    //Setters
    public void setId(long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }

}
