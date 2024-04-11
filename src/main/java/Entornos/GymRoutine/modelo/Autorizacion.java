package Entornos.GymRoutine.modelo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

/**
 *
 * @author juand
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = Autorizacion.TABLE_NAME)
public class Autorizacion {

    public static final String TABLE_NAME = "autorizacion";

    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private long id;
    @Column(name = "id_usuario", nullable = false)
    private Long idUsuario;
    @Column(name = "clave")
    private String clave;
    @Column(name = "fecha_inicio")
    private Date fechaInicio;
    @Column(name = "fecha_fin")
    private Date fechaFin;

    //Relaciones
    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_usuario", insertable = false, updatable = false)
    private Usuario usuario;
}
