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
@Table(name = EjerciciosRutina.TABLE_NAME)
public class EjerciciosRutina {

    public static final String TABLE_NAME = "ejercicios_rutina";

    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "id_ejercicio")
    private Long idEjercicio;
    @Column(name = "id_dia_semana")
    private Long idDiaSemana;
    @Column(name = "id_rutina")
    private Long idRutina;

    //Relaciones
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_ejercicio", insertable = false, updatable = false)
    private Ejercicio ejercicio;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_dia_semana", insertable = false, updatable = false)
    private DiaSemana diaSemana;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_rutina", insertable = false, updatable = false)
    private Rutina rutina;



}
