/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package st.repositorios;

import java.util.List;
import st.daos.factories.TransaccionDAOFactory;
import st.daos.transacciones.EspecialidadTGDAOImplement;
import st.entidades.Especialidad;
import st.entidades.Tecnico;

/**
 *
 * @author Matías Pacheco
 */
public class EspecialidadRImplement implements GenericoRepositorio<Especialidad, Integer>{
    private EspecialidadTGDAOImplement espTransaccionGDAOI;
    
    public EspecialidadRImplement(){
        this.espTransaccionGDAOI = TransaccionDAOFactory.getEspecialidadTGDAOI();
    }
    
    @Override
    public void add(Especialidad model) {
        espTransaccionGDAOI.create(model);
    }

    @Override
    public Especialidad get(Integer idModel) {
        return (Especialidad)espTransaccionGDAOI.read(idModel);
    }

    @Override
    public void update(Especialidad model) {
        espTransaccionGDAOI.update(model);
    }

    @Override
    public void remove(Integer idModel) {
        espTransaccionGDAOI.delete(idModel);
    }

    @Override
    public List<Especialidad> getModels() {
        return espTransaccionGDAOI.readRecords();
    }
    
    public List<Tecnico> getTecnicos(){
        return espTransaccionGDAOI.readTecnicos();
    }
}
