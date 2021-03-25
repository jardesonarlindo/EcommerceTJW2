package br.edu.ifce.dao;

import javax.persistence.EntityManager;

import br.edu.ifce.model.Products;
import br.edu.ifce.model.User;
import br.edu.ifce.utils.JPAUtil;

public class UserDao  extends GenericDao<User>{
	public UserDao() {
		super (User.class);
	}
	
	public String getUsuario() {
		EntityManager manager = JPAUtil.getEntityManager();
		User a = new UserDao().getById(6L);
		System.out.println(a.getLogin());
		return a.getLogin();
	}
	
	public String getSenha() {
		EntityManager manager = JPAUtil.getEntityManager();
		User a = new UserDao().getById(6L);
		System.out.println(a.getPassword());
		return a.getPassword();
	}
	
}
