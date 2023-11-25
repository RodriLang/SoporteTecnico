/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package st.daos.factories;

import st.daos.consultas.EspecialidadCGDAOImplement;
import st.daos.consultas.TecnicoCGDAOImplement;
import st.daos.consultas.ConsultaGenericaDAO;

/**
 *
 * @author Matías Pacheco
 */
public class PersistenciaDAOFactory {
    public static ConsultaGenericaDAO getTecnicoDAO(){
        return new TecnicoCGDAOImplement();
    }
    
    public static ConsultaGenericaDAO getEspecialidadDAO(){
        return new EspecialidadCGDAOImplement();
    }
}
