package br.edu.ifce.controller;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

import br.edu.ifce.model.User;
import br.edu.ifce.dao.UserDao;

@ManagedBean (name = "userBean")
@SessionScoped
public class UserBean implements Serializable{
	private static final long serialVersionUID = 1L;
	private User user = new User();
	private UserDao dao = new UserDao();
	public UserDao getDao() {
		return dao;
	}
	public void setDao(UserDao dao) {
		this.dao = dao;
	}
	private boolean LoginButton;
	
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	
	
	
}
