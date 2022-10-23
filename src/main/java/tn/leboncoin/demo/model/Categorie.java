package tn.leboncoin.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity  

@Table  
public class Categorie {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column 
	private int Id;  
	@Column  
	private String Name; 
	@Column  
	private int Parent;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getParent() {
		return Parent;
	}
	public void setParent(int parent) {
		Parent = parent;
	}
	@Override
	public String toString() {
		return "Categorie [Id=" + Id + ", Name=" + Name + ", Parent=" + Parent + "]";
	} 
	
}
