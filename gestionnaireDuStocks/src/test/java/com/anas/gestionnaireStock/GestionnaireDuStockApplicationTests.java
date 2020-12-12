package com.anas.gestionnaireStock;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.anas.gestionnaireStock.repos.GestionnaireStockRepository;
import org.springframework.data.domain.Page;
import com.anas.gestionnaireStock.Services.GestionnaireStockServices;
import com.anas.gestionnaireStock.entities.*;

@SpringBootTest
class GestionnaireDuStockApplicationTests {
	
	@Autowired
	private GestionnaireStockRepository gestionnaireStockRepository;
	private GestionnaireStockServices 	gestionnaireStockServices;
	
	@Test
	public void testCreateProduit() {
	GestionnaireStock Commande = new GestionnaireStock("voitures",new Date(),15,15.21,7);
	gestionnaireStockRepository.save(Commande);
	}
	
	@Test
	public void testFindProduits()
	{ GestionnaireStock Commande = gestionnaireStockRepository.findById(1L).get(); 
	System.out.println(Commande);
	}
	
	@Test
	public void testUpdateProduits()
	{
		GestionnaireStock Commande = gestionnaireStockRepository.findById(1L).get();
		Commande.setTaxe(1000.5); 
		gestionnaireStockRepository.save(Commande);
	}
	
	@Test
	public void testDeleteProduit() 
	{
		{
			gestionnaireStockRepository.deleteById(1L);
		}
	}
	
	@Test
	public void testListerTousProduits()
	{
		List<GestionnaireStock> prods = gestionnaireStockRepository.findAll();
		for (GestionnaireStock p : prods)
			{
				System.out.println(p);
			}
	}
	
	
	
		 
	/*Page<GestionnaireStock> prods=gestionnaireStockServices.getAllProduitsParPage(0,2);*/
	/*for (GestionnaireStock p : prods)
	{
	System.out.println(p);
	} 
	
	}*/
	
	 @Test
	 public void testFindByNomProduit()
	 {
	 List<GestionnaireStock> prods = gestionnaireStockRepository.findByNom("iphone X");
	 for (GestionnaireStock p : prods)
	 {
	 System.out.println(p);
	 }
	 }
	 @Test
	 public void testFindByNomProduitContains ()
	 {
	 List<GestionnaireStock> prods=gestionnaireStockRepository.findByNomContains("iphone X");
	 for (GestionnaireStock p : prods)
	 {
	 System.out.println(p);
	 } }
	 @Test
	 public void testfindByNomPrix()
	 {
	 List<GestionnaireStock> prods = gestionnaireStockRepository.findByNomPrix("iphone X", 1000.0);
	 for (GestionnaireStock p : prods)
	 {
	 System.out.println(p);
	 }
	 }
	 @Test
	 public void testfindByCategorie()
	 {
	 categoriee cat = new categoriee();
	 cat.setIdCat(1L);
	 List<GestionnaireStock> prods = gestionnaireStockRepository.findByCategorie(cat);
	 for (GestionnaireStock p : prods)
	 {
	 System.out.println(p);
	 }
	 }
	 @Test
	 public void findByCategorieIdCat()
	 {
	 List<GestionnaireStock> prods = gestionnaireStockRepository.findByCategorieIdCat(1L);
	 for (GestionnaireStock p : prods)
	 {
	 System.out.println(p);
	 }
	 }
	 @Test
	 public void testfindByOrderByNomProduitAsc()
	 {
	 List<GestionnaireStock> prods =
			 gestionnaireStockRepository.findByOrderByNomAsc();
	 for (GestionnaireStock p : prods)
	 {
	 System.out.println(p);
	 }
	 }
	 @Test
	 public void testTrierProduitsNomsPrix()
	 {
	 List<GestionnaireStock> prods = gestionnaireStockRepository.TrierNomsPrix();
	 for (GestionnaireStock p : prods)
	 {
	 System.out.println(p);
	 }
	 }


}


