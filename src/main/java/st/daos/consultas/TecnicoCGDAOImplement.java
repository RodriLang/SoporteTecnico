/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package st.daos.consultas;

import java.util.List;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import st.entidades.Especialidad;
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
        TypedQuery<Tecnico> consulta = em.createQuery("SELECT t FROM Tecnico t", Tecnico.class);
        return consulta.getResultList();
    }

    @Override
    public void setEntityManager(EntityManager em) {
        this.em = em;
    }
    
    public List<Especialidad> readEspecialidades(){
        TypedQuery<Especialidad> consulta = em.createQuery("SELECT e FROM Especialidad e JOIN e.tecnicos t WHERE t.id = :idTecnico", 
                Especialidad.class);
        consulta.setParameter("idTecnico", 1);
        return consulta.getResultList();
    }
}
