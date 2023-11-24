package st.entidades;



import st.entidades.enumerados.TipoProblema;
import st.entidades.enumerados.SistemaOperativo;
import st.entidades.enumerados.Aplicacion;
import java.util.List;
import lombok.Data;

public @Data class Servicio {

    private Aplicacion aplicacion;

    private SistemaOperativo sistema;

    private List<TipoProblema> problemas;
}
