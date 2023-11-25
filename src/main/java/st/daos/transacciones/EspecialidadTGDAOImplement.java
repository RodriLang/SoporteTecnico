/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package st.daos.transacciones;

import java.util.List;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import st.entidades.Especialidad;
import st.entidades.Tecnico;
import st.daos.factories.PersistenciaDAOFactory;
import st.daos.consultas.ConsultaGenericaDAO;

/**
 *
 * @author Matías Pacheco
 */
public class EspecialidadTGDAOImplement implements TransaccionGenericaDAO<Especialidad, Integer> {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA_PU");
    private ConsultaGenericaDAO genericoDAO;
//    private TecnicoDAO tecnicoDAO;
    
    public EspecialidadTGDAOImplement(){
        this.genericoDAO = PersistenciaDAOFactory.getEspecialidadDAO();
//        this.tecnicoDAO = PersistenciaDAOFactory.getTecnicoDAO();
    }
    
    private EntityManager obtenerEntityManagerConfigurado(){
        EntityManager em = emf.createEntityManager();
        genericoDAO.setEntityManager(em);
//        tecnicoDAO.setEntityManager(em);
        return em;
    }

    @Override
    public boolean create(Especialidad model) {
        EntityManager em = obtenerEntityManagerConfigurado();
        em.getTransaction().begin();
        genericoDAO.create(model);
        em.getTransaction().commit();
        em.close();
        return true;
    }

    @Override
    public Especialidad read(Integer idmodel) {
        EntityManager em = obtenerEntityManagerConfigurado();
        em.getTransaction().begin();
        Especialidad especialidad = (Especialidad)genericoDAO.read(idmodel);
        em.getTransaction().commit();
        em.close();
        return especialidad;
    }

    @Override
    public boolean update(Especialidad model) {
        EntityManager em = obtenerEntityManagerConfigurado();
        em.getTransaction().begin();
        genericoDAO.update(model);
        em.getTransaction().commit();
        em.close();
        return true;
    }

    @Override
    public boolean remove(Integer idModel) {
        EntityManager em = obtenerEntityManagerConfigurado();
        em.getTransaction().begin();
        Especialidad especialidad = (Especialidad)genericoDAO.read(idModel);
        genericoDAO.delete(especialidad);
        em.getTransaction().commit();
        em.close();
        return true;
    }

    @Override
    public List<Especialidad> readRecords() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
