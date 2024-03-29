package Entornos.GymRoutine.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.sql.Date;

/**
 *
 * @author juand
 */
@Entity
@Table(name = Membresia.TABLE_NAME)
public class Membresia {

    public static final String TABLE_NAME = "membresia";

    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @OneToOne
    @JoinColumn(name = "id_usuario")
    private Usuario idUsuario;
    @Column(name = "fecha_inicio")
    private Date fechaInicio;
    @Column(name = "fecha_fin")
    private Date fechaFin;

    //Constructores
    public Membresia() {
    }

    public Membresia(long id, Usuario idUsuario, Date fechaInicio, Date fechaFin) {
        this.id = id;
        this.idUsuario = idUsuario;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    //Getters
    public static String getTABLE_NAME() {
        return TABLE_NAME;
    }

    public long getId() {
        return id;
    }

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    //Setters
    public void setId(long id) {
        this.id = id;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

}
