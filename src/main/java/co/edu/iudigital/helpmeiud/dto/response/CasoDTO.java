package co.edu.iudigital.helpmeiud.dto.response;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CasoDTO {
    Long id;

    LocalDateTime fechaHora;

    Float latitud;

    Float longitud;

    Float altitud;

    String descripcion;

    Boolean esVisible;

    String urlMap;

    String rmiUrl;

    Long usuarioId;

    Long delitoId;
}
