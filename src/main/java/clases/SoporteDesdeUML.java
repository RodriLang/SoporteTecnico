package clases;







public class SoporteDesdeUML {

 
    public static void main(String[] args) {
     Operador ope = new Operador(new MesaDeEntrada());
    MesaDeEntrada mesa = (MesaDeEntrada)ope.getArea();
    mesa.crearIncidente();
    }

}
