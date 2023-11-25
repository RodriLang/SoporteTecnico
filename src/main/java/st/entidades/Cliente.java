package st.entidades;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.List;
import lombok.Data;

@Entity
public @Data
class Cliente {

    public Cliente() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String razonSocial;

    private String cuit;
    @OneToMany
    private List<Servicio> serviciosContratados;

    public Cliente(String razonSocial, String cuit) {
        this.razonSocial = razonSocial;
        this.cuit = cuit;
    }
}
