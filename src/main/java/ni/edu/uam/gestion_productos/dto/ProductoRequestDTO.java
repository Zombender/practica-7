package ni.edu.uam.gestion_productos.dto;

import java.math.BigDecimal;
import java.util.Set;

public class ProductoRequestDTO {
    private String codigo;
    private String nombre;
    private Integer categoriaId;
    private Set<Integer> etiquetasIds;
    private BigDecimal precioVenta;
    private int existencia;

    public Set<Integer> getEtiquetasIds() {
        return etiquetasIds;
    }

    public void setEtiquetasIds(Set<Integer> etiquetasIds) {
        this.etiquetasIds = etiquetasIds;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public BigDecimal getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(BigDecimal precioVenta) {
        this.precioVenta = precioVenta;
    }

    public Integer getExistencia() {
        return existencia;
    }

    public void setExistencia(Integer existencia) {
        this.existencia = existencia;
    }

    public Integer getCategoriaId() {
        return categoriaId;
    }

    public void setCategoriaId(Integer categoriaId) {
        this.categoriaId = categoriaId;
    }
}
