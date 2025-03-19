package aplicativo;

import dominio.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Principal {

    public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("aula-jpa");
        EntityManager em = emf.createEntityManager();
        
        Pessoa pessoa1 = new Pessoa("José", 35);
        Vendedor vendedor1 = new Vendedor("Samuel", 25, 1);
        Cliente cliente1 = new Cliente("Rafael", 34, 1);
        
        em.getTransaction().begin();
        
        em.persist(pessoa1);
        em.persist(vendedor1);
        em.persist(cliente1);
        
        em.getTransaction().commit();
        
        em.close();
        emf.close();
    }
}