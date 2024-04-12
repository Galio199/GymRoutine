package Entornos.GymRoutine.DTO;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
public class UsuarioCreateDTO {

    private String username;
    private String nombre;
    private String apellido;
    private String clave;
}
