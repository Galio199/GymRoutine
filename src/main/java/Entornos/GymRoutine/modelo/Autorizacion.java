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
@Table(name = Autorizacion.TABLE_NAME)
public class Autorizacion {

    public static final String TABLE_NAME = "autorizacion";

    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @OneToOne
    @JoinColumn(name = "id_usuario")
    private Usuario idUsuario;
    private String clave;
    @Column(name = "fecha_inicio")
    private Date fechaInicio;
    @Column(name = "fecha_fin")
    private Date fechaFin;
    @Column(name = "auth_token")
    private String authToken;

    //Constructores
    public Autorizacion() {
    }

    public Autorizacion(long id, Usuario idUsuario, String clave, Date fechaInicio, Date fechaFin, String authToken) {
        this.id = id;
        this.idUsuario = idUsuario;
        this.clave = clave;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.authToken = authToken;
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

    public String getClave() {
        return clave;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public String getAuthToken() {
        return authToken;
    }

    //Setters
    public void setId(long id) {
        this.id = id;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }

}
