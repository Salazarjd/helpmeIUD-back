package co.edu.iudigital.helpmeiud.service.iface;

import co.edu.iudigital.helpmeiud.dto.request.CasoDTORequest;
import co.edu.iudigital.helpmeiud.dto.response.CasoDTO;
import co.edu.iudigital.helpmeiud.exceptions.RestException;
import co.edu.iudigital.helpmeiud.model.Caso;

import java.util.List;

public interface ICasoService {

    List<CasoDTO> consultarTodos();

    Caso crear(CasoDTORequest casoDTORequest) throws RestException;

    Boolean visible(Boolean visible, Long id);

    CasoDTO consultarPorId(Long id);
}
