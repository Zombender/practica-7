package ni.edu.uam.gestion_productos.repository;

import ni.edu.uam.gestion_productos.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductoRepository
        extends JpaRepository<Producto, Integer> {
    List<Producto> findByCategoriaId(Integer categoriaId);
    @Query("SELECT p FROM Producto p JOIN p.etiquetas e WHERE e.id = :etiquetaId")
    List<Producto> findByEtiquetaId(@Param("etiquetaId") Long etiquetaId);
}
