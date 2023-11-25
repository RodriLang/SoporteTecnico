package st.test;

import st.entidades.Tecnico;
import st.repositorios.TecnicoRImplement;
public class Test {

 
    public static void main(String[] args) {
        TecnicoRImplement tecnicoRI = new TecnicoRImplement();
        
        Tecnico t1 = Tecnico.builder()
                .matricula(76767)
                .dni(30444555)
                .apellido("Gimenez")
                .nombre("Julia")
                .estado(true)
                .build();
        
        tecnicoRI.add(t1);
    }
}
