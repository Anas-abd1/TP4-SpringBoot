package com.anas.gestionnaireStock.Services;

import java.util.List;

import org.springframework.data.domain.Page;

import com.anas.gestionnaireStock.entities.GestionnaireStock;
import com.anas.gestionnaireStock.entities.categoriee;

public interface GestionnaireStockServices 
{
	GestionnaireStock saveProduit(GestionnaireStock G);
	GestionnaireStock updateProduit(GestionnaireStock G);
	void deleteProduit(GestionnaireStock G);
	void deleteProduitById(Long id);
	GestionnaireStock getProduit(Long id);
	List<GestionnaireStock> getAllProduits();
	Page<GestionnaireStock> getAllProduitsParPage(int page, int size);
	
	List<GestionnaireStock> findByNom(String nom);
	List<GestionnaireStock> findByNomContains(String nom);
	List<GestionnaireStock> findByNomPrix (String nom, Double prix);
	List<GestionnaireStock> findByCategorie (categoriee categorie);
	List<GestionnaireStock> findByCategorieIdCat(Long id);
	List<GestionnaireStock> findByOrderByNomProduitAsc();
	List<GestionnaireStock> trierNomsPrix();
	
}