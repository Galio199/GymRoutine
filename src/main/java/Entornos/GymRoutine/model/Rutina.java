package Entornos.GymRoutine.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author juand
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = Rutina.TABLE_NAME)
public class Rutina {

    public static final String TABLE_NAME = "rutina";

    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "id_usuario")
    private Long idUsuario;

    //Relaciones
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_usuario", insertable = false, updatable = false)
    private Usuario usuario;

}
