package model.dao;

import java.util.List;

import model.entities.Department;

public interface DepartmentDao {

	//aqui vou colocar o nome de como será cada função
	
	void insert(Department obj);
	void update(Department obj);
	void deleteById(Integer id);
	Department findById(Integer id);
	List<Department> findAll();
	
}
