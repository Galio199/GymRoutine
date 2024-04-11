package Entornos.GymRoutine.DTO;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
@NoArgsConstructor
public class MembresiaDTO {

    private String username;
    private Date fechaInicio;
    private Date fechaFin;
    private Long idUsuario;
}
