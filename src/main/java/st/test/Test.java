package st.test;

import st.entidades.Tecnico;
import st.repositorios.TecnicoRImplement;
public class Test {

 
    public static void main(String[] args) {
        TecnicoRImplement tecnicoRI = new TecnicoRImplement();
        
//        Tecnico t1 = Tecnico.builder()
//                .matricula(76768)
//                .dni(30444556)
//                .apellido("Imenez")
//                .nombre("Julio")
//                .estado(true)
//                .build();
//        
//        tecnicoRI.add(t1);

        System.out.println(tecnicoRI.get(1).getDni());
    }
}
