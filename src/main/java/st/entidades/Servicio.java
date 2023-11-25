package st.entidades;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import st.entidades.enumerados.TipoProblema;
import st.entidades.enumerados.SistemaOperativo;
import java.util.List;
import lombok.Data;

@Entity
public @Data
class Servicio {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private SistemaOperativo sistema;
    private List<TipoProblema> problemas;
}
