package clases;


import java.util.List;
import lombok.Data;

public @Data class Tecnico {

    private String nombre;

    private boolean disponible;

    private List<TipoProblema> especialidad;
}
