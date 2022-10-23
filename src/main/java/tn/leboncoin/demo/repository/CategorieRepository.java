package tn.leboncoin.demo.repository;

import org.springframework.data.repository.CrudRepository;

import tn.leboncoin.demo.model.Categorie;



public interface CategorieRepository extends CrudRepository<Categorie, Integer>   {
	

	//repository that extends CrudRepository   

}
