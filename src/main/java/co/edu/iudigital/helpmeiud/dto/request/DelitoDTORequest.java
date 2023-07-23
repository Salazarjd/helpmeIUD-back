package co.edu.iudigital.helpmeiud.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DelitoDTORequest {
    @NotNull(message = "Nombre no puede ser nulo") @NotEmpty(message = "Nombre no puede estar vacio") String nombre;
    String descripcion;
    @NotNull(message = "Debe proporcionar le ID del usuario")
    @JsonProperty(value = "usuario_id")
    Long usuarioId;
}

