package tn.leboncoin.demo.service;
import java.util.ArrayList;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;

import tn.leboncoin.demo.model.Categorie;
import tn.leboncoin.demo.repository.CategorieRepository;



//defining the business logic  
@Service 
public class CategorieService {

	
		
			@Autowired  
			CategorieRepository categorieRepository;  
			//getting all books record by using the method findaAll() of CrudRepository  

			//getting all books record by using the method findaAll() of CrudRepository  
			public List<Categorie> getAllCategorie()   
			{  
				List<Categorie> Categorie = new ArrayList<Categorie>();  
				categorieRepository.findAll().forEach(Categorie1 -> Categorie.add(Categorie1));  
				return Categorie;  	
			}  

			//getting a specific record by using the method findById() of CrudRepository  
			public Categorie getCategorieById(int id)   
			{  
				return categorieRepository.findById(id).get();  
			}  
			//saving a specific record by using the method save() of CrudRepository  
				public void saveOrUpdate(Categorie Categorie)   
				{  
					categorieRepository.save(Categorie);  
				} 

				//deleting a specific record by using the method deleteById() of CrudRepository  
				public void delete(int id)   
				{  
					categorieRepository.deleteById(id);  
				} 

				//updating a record  
				public void update(Categorie Categorie, int Categorieid)   
				{  
					categorieRepository.save( Categorie);  
				}  
			}



