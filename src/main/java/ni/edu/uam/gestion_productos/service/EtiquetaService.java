package ni.edu.uam.gestion_productos.service;

import ni.edu.uam.gestion_productos.dto.EtiquetaRequestDTO;
import ni.edu.uam.gestion_productos.entity.Etiqueta;
import ni.edu.uam.gestion_productos.repository.EtiquetaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EtiquetaService {

    private final EtiquetaRepository etiquetaRepository;

    public EtiquetaService(EtiquetaRepository etiquetaRepository) {
        this.etiquetaRepository = etiquetaRepository;
    }

    public List<Etiqueta> listar() {
        return etiquetaRepository.findAll();
    }
    public Etiqueta guardar(EtiquetaRequestDTO dto) {

        System.out.println("DTO -> " + dto);
        System.out.println("DTO nombre -> " + dto.getNombre());

        Etiqueta etiqueta = new Etiqueta();
        etiqueta.setNombre(dto.getNombre());

        System.out.println("Entidad nombre -> " + etiqueta.getNombre());

        return etiquetaRepository.save(etiqueta);
    }
}