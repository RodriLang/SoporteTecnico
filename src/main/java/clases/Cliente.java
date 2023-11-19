package clases;


import java.util.List;
import lombok.Data;

public @Data class Cliente {

    private String razonSocial;

    private String cuit;

    private List<Servicio> serviciosContratados;
}
