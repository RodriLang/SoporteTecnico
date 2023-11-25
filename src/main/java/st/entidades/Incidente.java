package st.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import st.entidades.enumerados.TipoProblema;
import java.time.LocalDate;
import java.util.List;
import lombok.Data;
import org.checkerframework.common.value.qual.BoolVal;

@Entity
public @Data
class Incidente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @OneToOne
    private Cliente cliente;

    @OneToOne
    private Tecnico tecnico;
    @ManyToMany
    private List<Problema> problemas;
    @Temporal(TemporalType.DATE)
    private LocalDate fechareporte;
    @Temporal(TemporalType.DATE)
    private LocalDate fechaResolucion;
    @BoolVal(false)
    private boolean resuelto;

    private String consideraciones;

}
