/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package st.daos.factories;

import st.daos.transacciones.EspecialidadTGDAOImplement;
import st.daos.transacciones.TecnicoTGDAOImplement;
import st.daos.transacciones.TransaccionGenericaDAO;

/**
 *
 * @author Matías Pacheco
 */
public class TransaccionDAOFactory {
    public static TecnicoTGDAOImplement getTecnicoDAO(){
        return new TecnicoTGDAOImplement();
    }
    
    public static EspecialidadTGDAOImplement getEspecialidadTGDAOI(){
        return new EspecialidadTGDAOImplement();
    }
}
