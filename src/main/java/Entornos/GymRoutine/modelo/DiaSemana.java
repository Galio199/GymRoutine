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
@NoArgsConstructor
@AllArgsConstructor
@Table(name = DiaSemana.TABLE_NAME)
public class DiaSemana {

    public static final String TABLE_NAME = "dias_semana";

    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "orden")
    private Integer orden;
    @Column(name = "nombre")
    private String nombre;


}
