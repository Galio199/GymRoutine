package Entornos.GymRoutine.modelo;

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
@AllArgsConstructor
@NoArgsConstructor
@Table(name = Membresia.TABLE_NAME)
public class Membresia {

    public static final String TABLE_NAME = "membresia";

    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "fecha_inicio")
    private Date fechaInicio;
    @Column(name = "fecha_fin")
    private Date fechaFin;
    @Column(name = "id_usuario")
    private Long idUsuario;

    //Relaciones
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;



}
