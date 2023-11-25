/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package st.daos.transacciones;

import java.util.List;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import st.entidades.Tecnico;
import st.daos.factories.PersistenciaDAOFactory;
import st.daos.consultas.ConsultaGenericaDAO;

/**
 *
 * @author Matías Pacheco
 */
public class TecnicoTGDAOImplement implements TransaccionGenericaDAO<Tecnico, Integer> {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA_PU");
    private ConsultaGenericaDAO persistenciaGenDAO;
//    private EspecialidadDAO especialidadDAO;
    
    public TecnicoTGDAOImplement(){
        this.persistenciaGenDAO = PersistenciaDAOFactory.getTecnicoDAO();
//        this.especialidadDAO = PersistenciaDAOFactory.getEspecialidadDAO();
    }
    
    private EntityManager obtenerEntityManagerConfigurado(){
        EntityManager em = emf.createEntityManager();
        persistenciaGenDAO.setEntityManager(em);
//        especialidadDAO.setEntityManager(em);
        return em;
    }

    @Override
    public boolean create(Tecnico model) {
        EntityManager em = obtenerEntityManagerConfigurado();
        em.getTransaction().begin();
        persistenciaGenDAO.create(model);
        em.getTransaction().commit();
        em.close();
        return true;
    }

    @Override
    public Tecnico read(Integer idModel) {
        EntityManager em = obtenerEntityManagerConfigurado();
        em.getTransaction().begin();
        Tecnico tecnico = (Tecnico)persistenciaGenDAO.read(idModel);
        em.getTransaction().commit();
        em.close();
        return tecnico;
    }

    @Override
    public boolean update(Tecnico model) {
        EntityManager em = obtenerEntityManagerConfigurado();
        em.getTransaction().begin();
        persistenciaGenDAO.update(model);
        em.getTransaction().commit();
        em.close();
        return true;
    }

    @Override
    public boolean remove(Integer idModel) {
        EntityManager em = obtenerEntityManagerConfigurado();
        em.getTransaction().begin();
        Tecnico tecnico = (Tecnico)persistenciaGenDAO.read(idModel);
        persistenciaGenDAO.delete(tecnico);
        em.getTransaction().commit();
        em.close();
        return true;
    }

    @Override
    public List<Tecnico> readRecords() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
