package model.entities;

import java.io.Serializable;

public class Department implements Serializable{

	//ser serializável significa poder ser transformado em bytes para poder trafegar na rede e ser gravado
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String name;
	
	//Construtores
	public Department() {
	}

	public Department(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	//Getters e Setters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//HashCode e Equals. Quero comparar o id pelo conteúdo e não pela referência de ponteiros.
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	//toString pra poder printar a classe
	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + "]";
	}
}
