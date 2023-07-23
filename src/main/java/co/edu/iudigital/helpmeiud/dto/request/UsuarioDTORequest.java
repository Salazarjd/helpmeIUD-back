package co.edu.iudigital.helpmeiud.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UsuarioDTORequest {
    @NotBlank(message = "username obligatorio")
    @Email
    String username;

    @NotBlank(message = "nombre obligatorio")
    String nombre;

    String apellido;

    @Size(min = 5, message = "Debe munistrar una contraseña segura")
    String password;

    @JsonProperty("red_social")
    Boolean redSocial;

    @JsonProperty("fecha_nacimiento")
    LocalDate fechaNacimiento;

    Boolean enabled;

    String image;
}
