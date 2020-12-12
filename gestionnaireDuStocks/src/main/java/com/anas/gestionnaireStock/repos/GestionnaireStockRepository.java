package com.anas.gestionnaireStock.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.anas.gestionnaireStock.entities.GestionnaireStock;
import com.anas.gestionnaireStock.entities.categoriee;



public interface GestionnaireStockRepository extends JpaRepository<GestionnaireStock,Long>{
		List<GestionnaireStock> findByNom(String nom);
		List<GestionnaireStock> findByNomContains(String nom); 
		@Query("select p from GestionnaireStock p where p.Nom like %?1 and p.Taxe > ?2")
		List<GestionnaireStock> findByNomPrix (String nom, Double prix);
		@Query("select p from GestionnaireStock p where p.categorie = ?1")
		List<GestionnaireStock> findByCategorie (categoriee categorie);
		List<GestionnaireStock> findByCategorieIdCat(Long id);
		List<GestionnaireStock> findByOrderByNomAsc();
		@Query("select p from GestionnaireStock p order by p.Nom ASC, p.Taxe DESC")
		List<GestionnaireStock> TrierNomsPrix();

		
}
