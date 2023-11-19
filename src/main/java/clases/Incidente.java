package clases;

import java.time.LocalDate;
import java.util.List;
import lombok.Data;

public @Data class Incidente {

    private Cliente cliente;

    private Tecnico tecnico;

    private List<TipoProblema> problemas;

    private LocalDate fechareporte;

    private LocalDate fechaResolucion;

    private boolean resuelto;

    private String consideraciones;

    public void untitledMethod() {
    }
}
