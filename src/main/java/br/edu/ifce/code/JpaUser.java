package br.edu.ifce.code;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import br.edu.ifce.model.User;
import br.edu.ifce.utils.JPAUtil;
import br.edu.ifce.dao.ProdutosDao;
import br.edu.ifce.model.Products;

public class JpaUser {
	public static void main (String arg[]) {
		EntityManager manager = JPAUtil.getEntityManager();
		Products a = new ProdutosDao().getById(6L);
		System.out.println(a.getNomeProduto());
		
		
		/*
		manager.getTransaction().begin();
		User a = manager.getReference(User.class, 1L);
		
		System.out.println(a.getLogin());
		System.out.println(a.getPassword());
		manager.getTransaction().commit();
		manager.close();
		*/
		
		
		/*
		//add usuario no banco
		manager.getTransaction().begin();
		Products a = new Products();
		a.setNomeProduto("Fogao");
		a.setPreco("500");
		manager.persist(a);
		manager.getTransaction().commit();
		manager.close();
		*/
		
	}

}
