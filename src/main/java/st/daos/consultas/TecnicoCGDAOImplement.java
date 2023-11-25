/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package st.daos.consultas;

import java.util.List;
import jakarta.persistence.EntityManager;
import st.entidades.Tecnico;

/**
 *
 * @author Matías Pacheco
 */
public class TecnicoCGDAOImplement implements ConsultaGenericaDAO<Tecnico, Integer> {
    private EntityManager em;

    @Override
    public boolean create(Tecnico model) {
        em.persist(model);
        return true;
    }

    @Override
    public Tecnico read(Integer idModel) {
        return em.find(Tecnico.class, idModel);
    }

    @Override
    public boolean update(Tecnico model) {
        em.merge(model);
        return true;
    }

    @Override
    public boolean delete(Tecnico model) {
        em.remove(model);
        return true;
    }

    @Override
    public List<Tecnico> readRecords() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setEntityManager(EntityManager em) {
        this.em = em;
    }
}