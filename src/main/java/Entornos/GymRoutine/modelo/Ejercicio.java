package Entornos.GymRoutine.modelo;

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
@Table(name = Ejercicio.TABLE_NAME)
public class Ejercicio {

    public static final String TABLE_NAME = "ejercicios";

    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "id_dificultad_ejercicio")
    private Long idDificultad;
    @Column(name = "id_tipo_ejercicio")
    private Long idTipoEjercicio;

    //Relaciones
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_dificultad_ejercicio")
    private DificultadEjercicio dificultadEjercicio;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_tipo_ejercicio")
    private TipoEjercicio tipoEjercicio;

}
