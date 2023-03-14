package tn.esprit.examen.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.examen.entities.Etudiant;
import tn.esprit.examen.services.IEtudiantService;
@RestController
@RequestMapping("/etudiant")
public class EtudiantController {
	
	@Autowired
	IEtudiantService etudiantService;
	// http://localhost:8086/SpringMVC/etudiant/ajouter-etudiant
	@PostMapping("/ajouter-etudiant")
	@ResponseBody
	public void ajouterEtudiant(@RequestBody Etudiant etudiant) {
		etudiantService.ajouterEtudiant(etudiant);
		
	}
	//http://localhost:8086/SpringMVC/etudiant/affecterEtudiantAucours/1/1
	@PutMapping("/affecterEtudiantAucours/{idEtudiant}/{idCours}")
	@ResponseBody
	public void affecterEtudiantAucours(@PathVariable("idEtudiant") 
	Long idEtudiant,@PathVariable("idCours") Long idCours) {
		etudiantService.affecterEtudiantAucours(idEtudiant, idCours);
	}
}
