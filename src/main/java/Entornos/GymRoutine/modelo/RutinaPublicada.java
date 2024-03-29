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
@Table(name = RutinaPublicada.TABLE_NAME)
public class RutinaPublicada {

    public static final String TABLE_NAME = "rutinas_publicadas";

    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    @JoinColumn(name = "id_rutina")
    private Rutina idRutina;

    //Constructores
    public RutinaPublicada() {
    }

    public RutinaPublicada(long id, Rutina idRutina) {
        this.id = id;
        this.idRutina = idRutina;
    }

    //Getters
    public static String getTABLE_NAME() {
        return TABLE_NAME;
    }

    public long getId() {
        return id;
    }

    public Rutina getIdRutina() {
        return idRutina;
    }

    //Setters
    public void setId(long id) {
        this.id = id;
    }

    public void setIdRutina(Rutina idRutina) {
        this.idRutina = idRutina;
    }

}
