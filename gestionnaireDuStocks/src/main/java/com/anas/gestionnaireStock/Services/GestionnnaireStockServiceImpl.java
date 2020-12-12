package com.anas.gestionnaireStock.Services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.anas.gestionnaireStock.entities.GestionnaireStock;
import com.anas.gestionnaireStock.entities.categoriee;
import com.anas.gestionnaireStock.repos.GestionnaireStockRepository;

@Service
public class GestionnnaireStockServiceImpl implements GestionnaireStockServices {
	@Autowired
	GestionnaireStockRepository  gestionnnaireStockRepository;
	@Override
	public GestionnaireStock saveProduit(GestionnaireStock G) {
		
		return gestionnnaireStockRepository.save(G);
	}

	@Override
	public GestionnaireStock updateProduit(GestionnaireStock G) {
	
		  return gestionnnaireStockRepository.save(G);
	}

	@Override
	public void deleteProduit(GestionnaireStock G) {
		gestionnnaireStockRepository.delete(G);
		
	}

	@Override
	public void deleteProduitById(Long id) {
		gestionnnaireStockRepository.deleteById(id);
		
	}

	@Override
	public GestionnaireStock getProduit(Long id) {
		
		return gestionnnaireStockRepository.findById(id).get();
	}

	@Override
	public List<GestionnaireStock> getAllProduits() {
		
		return gestionnnaireStockRepository.findAll();
	}

	@Override
	public Page<GestionnaireStock> getAllProduitsParPage(int page, int size) {
		return gestionnnaireStockRepository.findAll(PageRequest.of(page, size));
	}

	@Override
	public List<GestionnaireStock> findByNom(String nom) {
	return gestionnnaireStockRepository.findByNom(nom);
	}
	@Override
	public List<GestionnaireStock> findByNomContains(String nom) {
	return gestionnnaireStockRepository.findByNomContains(nom);
	}
	@Override
	public List<GestionnaireStock> findByNomPrix(String nom, Double prix) {
	return gestionnnaireStockRepository.findByNomPrix(nom, prix);
	}
	@Override
	public List<GestionnaireStock> findByCategorie(categoriee categorie) {
	return gestionnnaireStockRepository.findByCategorie(categorie);
	}
	@Override
	public List<GestionnaireStock> findByCategorieIdCat(Long id) {
	return gestionnnaireStockRepository.findByCategorieIdCat(id);
	}
	@Override
	public List<GestionnaireStock> findByOrderByNomProduitAsc() {
	return gestionnnaireStockRepository.findByOrderByNomAsc();
	}
	@Override
	public List<GestionnaireStock> trierNomsPrix() {
	return gestionnnaireStockRepository.TrierNomsPrix();
	}
	
}
