package tn.leboncoin.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tn.leboncoin.demo.model.Categorie;
import tn.leboncoin.demo.service.CategorieService;


//mark class as Controller  


@RestController 
@CrossOrigin(origins = "*") 
//@RequestMapping("/api")


public class CategorieController {


	//autowire the BooksService class  
	@Autowired  
	CategorieService categorieService;  

	//creating a get mapping that retrieves all the books detail from the database   
	@GetMapping("/Categorie")

	private List<Categorie> getAllCategorie()   
	{  
		return categorieService.getAllCategorie();  
	}  

	//creating a get mapping that retrieves the detail of a specific book  
	@GetMapping("/Categorie/{Categorieid}")  
	private Categorie getCategories(@PathVariable("Categorieid") int Categorieid)   
	{  
		return categorieService.getCategorieById(Categorieid);  
	}  


	//creating a delete mapping that deletes a specified book  
	@DeleteMapping("/Categorie/{Categorieid}")  
	private void deleteCategorie(@PathVariable("Categorieid") int Categorieid)   
	{  
		categorieService.delete(Categorieid);  
	} 

	@PostMapping("/Categorie")  
	private int saveCategorie(@RequestBody Categorie p)   
	{  
		categorieService.saveOrUpdate(p);  
		return p.getId();  
	} 

	//creating put mapping that updates the book detail
	@CrossOrigin(origins = "*")
	@PutMapping("/Categorie")  
	private Categorie update(@RequestBody  Categorie Categorie)   
	{  
		categorieService.saveOrUpdate(Categorie);  
		return Categorie;  
	}  



}
