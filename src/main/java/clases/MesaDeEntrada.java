package clases;



import javax.swing.JFrame;

public class MesaDeEntrada extends JFrame implements Area {

    private Incidente incidente;

    public Incidente crearIncidente() {
        return new Incidente();
    }

    private Operador operador;
}
