package clases;



import java.util.List;
import lombok.Data;

public @Data class Servicio {

    private TipoAplicacion aplicacion;

    private SistemaOperativo sistema;

    private List<TipoProblema> problemas;
}
