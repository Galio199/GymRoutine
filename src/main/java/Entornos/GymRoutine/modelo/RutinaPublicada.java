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
@Table(name = RutinaPublicada.TABLE_NAME)
public class RutinaPublicada {

    public static final String TABLE_NAME = "rutinas_publicadas";

    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "id_rutina")
    private Long idRutina;

    @ManyToOne
    @JoinColumn(name = "id_rutina", insertable = false, updatable = false)
    private Rutina rutina;



}
