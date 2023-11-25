/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package st.repositorios;

import java.util.List;
import st.daos.factories.TransaccionDAOFactory;
import st.daos.transacciones.TransaccionGenericaDAO;
import st.entidades.Tecnico;

/**
 *
 * @author Matías Pacheco
 */
public class TecnicoRImplement implements GenericoRepositorio<Tecnico, Integer>{
    private TransaccionGenericaDAO transaccionGenDAO;
    
    public TecnicoRImplement(){
        this.transaccionGenDAO = TransaccionDAOFactory.getTecnicoDAO();
    }
    
    @Override
    public void add(Tecnico model) {
        transaccionGenDAO.create(model);
    }

    @Override
    public Tecnico get(Integer idModel) {
        return (Tecnico)transaccionGenDAO.read(idModel);
    }

    @Override
    public void update(Tecnico model) {
        transaccionGenDAO.update(model);
    }

    @Override
    public void remove(Integer idModel) {
        transaccionGenDAO.remove(idModel);
    }

    @Override
    public List<Tecnico> getModels() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
