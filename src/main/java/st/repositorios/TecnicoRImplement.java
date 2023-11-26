/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package st.repositorios;

import java.util.List;
import st.daos.factories.TransaccionDAOFactory;
import st.daos.transacciones.TecnicoTGDAOImplement;
import st.entidades.Especialidad;
import st.entidades.Tecnico;

/**
 *
 * @author Matías Pacheco
 */
public class TecnicoRImplement implements GenericoRepositorio<Tecnico, Integer>{
    private TecnicoTGDAOImplement tecTransaccionGDAOI;
    
    public TecnicoRImplement(){
        this.tecTransaccionGDAOI = TransaccionDAOFactory.getTecnicoDAO();
    }
    
    @Override
    public void add(Tecnico model) {
        tecTransaccionGDAOI.create(model);
    }

    @Override
    public Tecnico get(Integer idModel) {
        return (Tecnico)tecTransaccionGDAOI.read(idModel);
    }

    @Override
    public void update(Tecnico model) {
        tecTransaccionGDAOI.update(model);
    }

    @Override
    public void remove(Integer idModel) {
        tecTransaccionGDAOI.delete(idModel);
    }

    @Override
    public List<Tecnico> getModels() {
        return tecTransaccionGDAOI.readRecords();
    }
    
    public List<Especialidad> getEspecialidades(){
        return tecTransaccionGDAOI.readEspecialidades();
    }
}
