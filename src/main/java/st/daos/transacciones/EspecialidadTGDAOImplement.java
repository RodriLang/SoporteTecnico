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
import st.daos.factories.ConsultaDAOFactory;
import st.daos.consultas.ConsultaGenericaDAO;
import st.daos.consultas.EspecialidadCGDAOImplement;

/**
 *
 * @author Matías Pacheco
 */
public class EspecialidadTGDAOImplement implements TransaccionGenericaDAO<Especialidad, Integer> {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA_PU");
    private EspecialidadCGDAOImplement espConsultaGDAOI;
//    private TecnicoDAO tecnicoDAO;
    
    public EspecialidadTGDAOImplement(){
        this.espConsultaGDAOI = ConsultaDAOFactory.getEspecialidadCGDAOI();
//        this.tecnicoDAO = ConsultaDAOFactory.getTecnicoCGDAOI();
    }
    
    private EntityManager obtenerEntityManagerConfigurado(){
        EntityManager em = emf.createEntityManager();
        espConsultaGDAOI.setEntityManager(em);
//        tecnicoDAO.setEntityManager(em);
        return em;
    }

    @Override
    public boolean create(Especialidad model) {
        EntityManager em = obtenerEntityManagerConfigurado();
        em.getTransaction().begin();
        espConsultaGDAOI.create(model);
        em.getTransaction().commit();
        em.close();
        return true;
    }

    @Override
    public Especialidad read(Integer idmodel) {
        EntityManager em = obtenerEntityManagerConfigurado();
        em.getTransaction().begin();
        Especialidad especialidad = (Especialidad)espConsultaGDAOI.read(idmodel);
        em.getTransaction().commit();
        em.close();
        return especialidad;
    }

    @Override
    public boolean update(Especialidad model) {
        EntityManager em = obtenerEntityManagerConfigurado();
        em.getTransaction().begin();
        espConsultaGDAOI.update(model);
        em.getTransaction().commit();
        em.close();
        return true;
    }

    @Override
    public boolean delete(Integer idModel) {
        EntityManager em = obtenerEntityManagerConfigurado();
        em.getTransaction().begin();
        Especialidad especialidad = (Especialidad)espConsultaGDAOI.read(idModel);
        espConsultaGDAOI.delete(especialidad);
        em.getTransaction().commit();
        em.close();
        return true;
    }

    @Override
    public List<Especialidad> readRecords() {
        EntityManager em = obtenerEntityManagerConfigurado();
        em.getTransaction().begin();
        List<Especialidad> registro = espConsultaGDAOI.readRecords();
        em.getTransaction().commit();
        em.close();
        return registro;
    }
    
    public List<Tecnico> readTecnicos(){
        EntityManager em = obtenerEntityManagerConfigurado();
        em.getTransaction().begin();
        List<Tecnico> registro = espConsultaGDAOI.readTecnicos();
        em.getTransaction().commit();
        em.close();
        return registro;
    }
}
