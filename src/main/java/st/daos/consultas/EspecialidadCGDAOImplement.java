/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package st.daos.consultas;

import java.util.List;
import jakarta.persistence.EntityManager;
import st.entidades.Especialidad;

/**
 *
 * @author Matías Pacheco
 */
public class EspecialidadCGDAOImplement implements ConsultaGenericaDAO<Especialidad, Integer> {
    private EntityManager em;

    @Override
    public boolean create(Especialidad model) {
        em.persist(model);
        return true;
    }

    @Override
    public Especialidad read(Integer idModel) {
        return em.find(Especialidad.class, idModel);
    }

    @Override
    public boolean update(Especialidad model) {
        em.merge(model);
        return true;
    }

    @Override
    public boolean delete(Especialidad model) {
        em.remove(model);
        return true;
    }

    @Override
    public List<Especialidad> readRecords() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setEntityManager(EntityManager em) {
        this.em = em;
    }
}
