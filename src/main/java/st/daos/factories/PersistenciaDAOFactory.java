/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package st.daos.factories;

import st.daos.persistencia.EspecialidadPGDAOImplement;
import st.daos.persistencia.TecnicoPGDAOImplement;
import st.daos.persistencia.PersistenciaGenericaDAO;

/**
 *
 * @author Matías Pacheco
 */
public class PersistenciaDAOFactory {
    public static PersistenciaGenericaDAO getTecnicoDAO(){
        return new TecnicoPGDAOImplement();
    }
    
    public static PersistenciaGenericaDAO getEspecialidadDAO(){
        return new EspecialidadPGDAOImplement();
    }
}
