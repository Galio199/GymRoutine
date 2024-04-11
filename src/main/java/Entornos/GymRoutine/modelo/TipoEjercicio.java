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
@Table(name = TipoEjercicio.TABLE_NAME)
public class TipoEjercicio {

    public static final String TABLE_NAME = "tipos_ejercicio";

    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "nombre")
    private String nombre;

}
