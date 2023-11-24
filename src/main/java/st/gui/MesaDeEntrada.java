package st.gui;



import javax.swing.JFrame;
import st.entidades.Incidente;
import st.entidades.Operador;

public class MesaDeEntrada extends JFrame implements Area {

    private Incidente incidente;

    public Incidente crearIncidente() {
        return new Incidente();
    }

    private Operador operador;
}
