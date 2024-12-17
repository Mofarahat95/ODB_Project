

import java.util.*;
import javax.persistence.*;

public class DB {
	private static final String DB_URL = "objectdb/db/llab.odb";
    // Create Chemist
    public static void addChemist(Chemist c) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(DB_URL);
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        em.persist(c);
        em.getTransaction().commit();

        em.close();
        emf.close();
    }

    // Create Project
    public static void addProject(Project p) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(DB_URL);
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        em.persist(p);
        em.getTransaction().commit();

        em.close();
        emf.close();
    }

    // Create Equipment
    public static void addEquipment(Equipment e) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(DB_URL);
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        em.persist(e);
        em.getTransaction().commit();

        em.close();
        emf.close();
    }

    // Create Assignment
    public static void addAssignment(Assignment a) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(DB_URL);
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        em.persist(a);
        em.getTransaction().commit();

        em.close();
        emf.close();
    }
    
 // Retrieve Project 
    public static Project getProjectById(int id) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(DB_URL);
        EntityManager em = emf.createEntityManager();
        Project project = em.find(Project.class, id);
        em.close();
        emf.close();
        return project;
    }

    // Retrieve Chemist 
    public static Chemist getChemistByssn(String ssn) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(DB_URL);
        EntityManager em = emf.createEntityManager();
        Chemist chemist = em.find(Chemist.class, ssn);
        em.close();
        emf.close();
        return chemist;
    }

    // Retrieve Equipment 
    public static Equipment getEquipmentBySerialNo( String  serialNo) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(DB_URL);
        EntityManager em = emf.createEntityManager();
        Equipment equipment = em.find(Equipment.class, serialNo);
        em.close();
        emf.close();
        return equipment;
    }

    // Retrieve Assignment 
    public static Assignment getAssignmentById(int id) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(DB_URL);
        EntityManager em = emf.createEntityManager();
        Assignment assignment = em.find(Assignment.class, id);
        em.close();
        emf.close();
        return assignment;
    }
     //update chemist
    public static void updateChemist(String ssn, String newName, String newPhoneNo, int newAge, String newAddress) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(DB_URL);
        EntityManager em = emf.createEntityManager();
        Chemist chemist = em.find(Chemist.class, ssn);
        if (chemist != null) {
            em.getTransaction().begin();
            chemist.setName(newName);
            chemist.setPhoneNo(newPhoneNo);
            chemist.setAge(newAge);
            chemist.setAddress(newAddress);
            em.getTransaction().commit();
        }
        em.close();
        emf.close();
    }

 // Update Equipment
    public static void updateEquipment(String serialNo, double newCost, String newType, boolean isAvailable) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(DB_URL);
        EntityManager em = emf.createEntityManager();
        Equipment equipment = em.find(Equipment.class, serialNo);
        if (equipment != null) {
            em.getTransaction().begin();
            equipment.setCost(newCost);
            equipment.setType(newType);
            equipment.setAvailable(isAvailable);
            em.getTransaction().commit();
        }
        em.close();
        emf.close();
    }

    // Update Project 
    public static void updateProject(int id, String newPName, Date newStartDate) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(DB_URL);
        EntityManager em = emf.createEntityManager();
        Project project = em.find(Project.class, id);
        if (project != null) {
            em.getTransaction().begin();
            project.setPName(newPName);
            project.setStart_Date(newStartDate);
            em.getTransaction().commit();
        }
        em.close();
        emf.close();
    }

    // Update Assignment
    public static void updateAssignment(int id, Date newAssignDate, double newTotalHours, double newAverageHours) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(DB_URL);
        EntityManager em = emf.createEntityManager();
        Assignment assignment = em.find(Assignment.class, id);
        if (assignment != null) {
            em.getTransaction().begin();
            assignment.setAssignDate(newAssignDate);
            assignment.setTotalHours(newTotalHours);
            assignment.setAverageHours(newAverageHours);
            em.getTransaction().commit();
        }
        em.close();
        emf.close();
    }
    
 // Delete Chemist
    public static void deleteChemist(String ssn) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(DB_URL);
        EntityManager em = emf.createEntityManager();
        Chemist chemist = em.find(Chemist.class, ssn);
        if (chemist != null) {
            em.getTransaction().begin();
            em.remove(chemist);
            em.getTransaction().commit();
        }
        em.close();
        emf.close();
    }

    // Delete Equipment
    public static void deleteEquipment(String serialNo) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(DB_URL);
        EntityManager em = emf.createEntityManager();
        Equipment equipment = em.find(Equipment.class, serialNo);
        if (equipment != null) {
            em.getTransaction().begin();
            em.remove(equipment);
            em.getTransaction().commit();
        }
        em.close();
        emf.close();
    }

    // Delete Project
    public static void deleteProject(int id) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(DB_URL);
        EntityManager em = emf.createEntityManager();
        Project project = em.find(Project.class, id);
        if (project != null) {
            em.getTransaction().begin();
            em.remove(project);
            em.getTransaction().commit();
        }
        em.close();
        emf.close();
    }

    // Delete Assignment
    public static void deleteAssignment(int id) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(DB_URL);
        EntityManager em = emf.createEntityManager();
        Assignment assignment = em.find(Assignment.class, id);
        if (assignment != null) {
            em.getTransaction().begin();
            em.remove(assignment);
            em.getTransaction().commit();
        }
        em.close();
        emf.close();
    }
}

