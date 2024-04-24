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
@NoArgsConstructor
@AllArgsConstructor
@Table(name = DificultadEjercicio.TABLE_NAME)
public class DificultadEjercicio {

    public static final String TABLE_NAME = "dificultades_ejercicio";

    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "nombre")
    private String nombre;

}
