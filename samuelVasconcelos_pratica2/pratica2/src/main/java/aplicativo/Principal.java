package aplicativo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dominio.Cliente;
import dominio.Produto;
import dominio.Venda;

public class Principal {

	public static void main(String[] args) {
		
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("aula-jpa"); 
		EntityManager em = null;
		try {
			//Instancia o EntityManagerFactory com as configurações de persistencia
			//Intancia o EntityManager
			em = emf.createEntityManager(); 
			
			em.getTransaction().begin();
	
			Produto produto1 = new Produto("Mouse", 100.0);
			Produto produto2 = new Produto("Teclado", 259.0);
			Produto produto3 = new Produto("Monitor", 850.0);
			Produto produto4 = new Produto("Sabão em Pó Gamer", 50.0);

			em.persist (produto1);
			em.persist (produto2);
			em.persist (produto3);
			em.persist (produto4);


			Cliente cliente1 = new Cliente("Samuel Vasconcelos");
			Cliente cliente2 = new Cliente("Jokinha");
			Cliente cliente3 = new Cliente("Ogust");
			Cliente cliente4 = new Cliente("Taigakilla");

			Venda venda1 = new Venda(900.0);
			Venda venda2 = new Venda(1000.0);
			Venda venda3 = new Venda(2000.0);
			Venda venda4 = new Venda(3000.0);
			venda1.setProdutos(Arrays.asList(produto1, produto2));
			venda2.setProdutos(Arrays.asList(produto3, produto2));
			venda3.setProdutos(Arrays.asList(produto1, produto3));
			venda4.setProdutos(Arrays.asList(produto3, produto4));

			venda1.setCliente(cliente1);
			venda2.setCliente(cliente2);
			venda3.setCliente(cliente3);
			venda4.setCliente(cliente4);

			cliente1.setVendas(Arrays.asList(venda1));
			cliente2.setVendas(Arrays.asList(venda2));
			cliente3.setVendas(Arrays.asList(venda3));
			cliente4.setVendas(Arrays.asList(venda4));

			em.persist(cliente1);
			em.persist(cliente2);
			em.persist(cliente3);
			em.persist(cliente4);

			em.persist(venda1);
			em.persist(venda2);
			em.persist(venda3);
			em.persist(venda4);

			em.persist(cliente1);
			em.persist(venda1);

			
			Query consultarClientes = em.createQuery("select cliente from Cliente cliente");
			ArrayList<Cliente> listaCliente = (ArrayList<Cliente>) consultarClientes.getResultList();
			Query consultarProdutos = em.createQuery("select produto from Produto produto");
			ArrayList<Produto> listaProduto = (ArrayList<Produto>) consultarProdutos.getResultList();
			Query consultarVendas = em.createQuery("select venda from Venda venda");
			ArrayList<Venda> listaVenda = (ArrayList<Venda>) consultarVendas.getResultList();


			em.getTransaction().commit();//confirmar as alterações realizadas
			
			emf.close();
			em.close();
			
			// Inserir os laços for aqui!
			for(Cliente objC: listaCliente) {
				System.out.println(objC);
			}
			for(Produto objP: listaProduto) {
				System.out.println(objP);
			}
			for(Venda objV: listaVenda) {
				System.out.println(objV);
			}

		}catch (Exception e){
			if(em.getTransaction() != null) {
				em.getTransaction().rollback();
			}
			e.printStackTrace();
		}finally {
			if(em != null) {
				em.close();
			}
			if(emf != null) {
				emf.close();
			}
		}
	}			
}
