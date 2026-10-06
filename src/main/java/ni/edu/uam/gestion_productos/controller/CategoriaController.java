package ni.edu.uam.gestion_productos.controller;

import ni.edu.uam.gestion_productos.dto.CategoriaRequestDTO;
import ni.edu.uam.gestion_productos.entity.Categoria;
import ni.edu.uam.gestion_productos.repository.CategoriaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categorias")
public class CategoriaController {

    private final CategoriaRepository repository;

    public CategoriaController(CategoriaRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<CategoriaRequestDTO> listar() {

        return repository.findAll()
                .stream()
                .map(categoria -> {
                    CategoriaRequestDTO dto = new CategoriaRequestDTO();

                    dto.setId(categoria.getId());
                    dto.setNombre(categoria.getNombre());
                    dto.setActiva(categoria.isActiva());

                    return dto;
                })
                .toList();
    }

    @PostMapping
    public CategoriaRequestDTO guardar(
            @RequestBody CategoriaRequestDTO dto) {

        Categoria categoria = new Categoria();

        categoria.setNombre(dto.getNombre());
        categoria.setActiva(dto.isActiva());

        Categoria guardada = repository.save(categoria);

        CategoriaRequestDTO response = new CategoriaRequestDTO();

        response.setId(guardada.getId());
        response.setNombre(guardada.getNombre());
        response.setActiva(guardada.isActiva());

        return response;
    }
}
