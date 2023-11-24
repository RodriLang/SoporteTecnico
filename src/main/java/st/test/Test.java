package st.test;

import st.gui.MesaDeEntrada;
import st.entidades.Operador;







public class Test {

 
    public static void main(String[] args) {
     Operador ope = new Operador(new MesaDeEntrada());
    MesaDeEntrada mesa = (MesaDeEntrada)ope.getArea();
    mesa.crearIncidente();
    }

}
