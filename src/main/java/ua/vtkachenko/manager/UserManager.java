package ua.vtkachenko.manager;

import ua.vtkachenko.dao.UserDAO;
import ua.vtkachenko.model.UserModel;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class UserManager {

	@Inject
	public UserDAO userDAO;

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	public void addUser(UserModel model) {
		userDAO.addUser(model);
	}

}