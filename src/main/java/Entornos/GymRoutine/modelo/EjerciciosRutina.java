package Entornos.GymRoutine.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 *
 * @author juand
 */
@Entity
@Table(name = EjerciciosRutina.TABLE_NAME)
public class EjerciciosRutina {

    public static final String TABLE_NAME = "ejercicios_rutina";

    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    @JoinColumn(name = "id_ejercicio")
    private Ejercicio idEjercicio;
    @ManyToOne
    @JoinColumn(name = "id_dia_semana")
    private DiaSemana idDiaSemana;
    @ManyToOne
    @JoinColumn(name = "id_rutina")
    private Rutina idRutina;

    //Constructores
    public EjerciciosRutina() {
    }

    public EjerciciosRutina(long id, Ejercicio idEjercicio, DiaSemana idDiaSemana, Rutina idRutina) {
        this.id = id;
        this.idEjercicio = idEjercicio;
        this.idDiaSemana = idDiaSemana;
        this.idRutina = idRutina;
    }

    //Getters
    public static String getTABLE_NAME() {
        return TABLE_NAME;
    }

    public long getId() {
        return id;
    }

    public Ejercicio getIdEjercicio() {
        return idEjercicio;
    }

    public DiaSemana getIdDiaSemana() {
        return idDiaSemana;
    }

    public Rutina getIdRutina() {
        return idRutina;
    }

    //Setters
    public void setId(long id) {
        this.id = id;
    }

    public void setIdEjercicio(Ejercicio idEjercicio) {
        this.idEjercicio = idEjercicio;
    }

    public void setIdDiaSemana(DiaSemana idDiaSemana) {
        this.idDiaSemana = idDiaSemana;
    }

    public void setIdRutina(Rutina idRutina) {
        this.idRutina = idRutina;
    }

}
