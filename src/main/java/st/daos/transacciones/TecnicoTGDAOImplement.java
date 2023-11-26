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
import st.daos.factories.ConsultaDAOFactory;
import st.daos.consultas.TecnicoCGDAOImplement;
import st.entidades.Especialidad;

/**
 *
 * @author Matías Pacheco
 */
public class TecnicoTGDAOImplement implements TransaccionGenericaDAO<Tecnico, Integer> {
    private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA_PU");
    private TecnicoCGDAOImplement tecConsultaGDAOI;
//    private EspecialidadDAO especialidadDAO;
    
    public TecnicoTGDAOImplement(){
        this.tecConsultaGDAOI = ConsultaDAOFactory.getTecnicoCGDAOI();
//        this.especialidadDAO = ConsultaDAOFactory.getEspecialidadCGDAOI();
    }
    
    private EntityManager obtenerEntityManagerConfigurado(){
        EntityManager em = emf.createEntityManager();
        tecConsultaGDAOI.setEntityManager(em);
//        especialidadDAO.setEntityManager(em);
        return em;
    }

    @Override
    public boolean create(Tecnico model) {
        EntityManager em = obtenerEntityManagerConfigurado();
        em.getTransaction().begin();
        tecConsultaGDAOI.create(model);
        em.getTransaction().commit();
        em.close();
        return true;
    }

    @Override
    public Tecnico read(Integer idModel) {
        EntityManager em = obtenerEntityManagerConfigurado();
        em.getTransaction().begin();
        Tecnico tecnico = tecConsultaGDAOI.read(idModel);
        em.getTransaction().commit();
        em.close();
        return tecnico;
    }

    @Override
    public boolean update(Tecnico model) {
        EntityManager em = obtenerEntityManagerConfigurado();
        em.getTransaction().begin();
        tecConsultaGDAOI.update(model);
        em.getTransaction().commit();
        em.close();
        return true;
    }

    @Override
    public boolean delete(Integer idModel) {
        EntityManager em = obtenerEntityManagerConfigurado();
        em.getTransaction().begin();
        Tecnico tecnico = tecConsultaGDAOI.read(idModel);
        tecConsultaGDAOI.delete(tecnico);
        em.getTransaction().commit();
        em.close();
        return true;
    }

    @Override
    public List<Tecnico> readRecords() {
        EntityManager em = obtenerEntityManagerConfigurado();
        em.getTransaction().begin();
        List<Tecnico> registro = tecConsultaGDAOI.readRecords();
        em.getTransaction().commit();
        em.close();
        return registro;
    }
    
    public List<Especialidad> readEspecialidades(){
        EntityManager em = obtenerEntityManagerConfigurado();
        em.getTransaction().begin();
//        TecnicoCGDAOImplement tec = new TecnicoCGDAOImplement();
//        tec.setEntityManager(em);
        List<Especialidad> registro = tecConsultaGDAOI.readEspecialidades();
        em.getTransaction().commit();
        em.close();
        return registro;
    }
}
