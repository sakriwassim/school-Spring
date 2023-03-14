package tn.esprit.examen.services;

import tn.esprit.examen.entities.Etudiant;

public interface IEtudiantService {
	
	void ajouterEtudiant(Etudiant etudiant);
	void affecterEtudiantAucours(Long idEtudiant, Long idCours);

}
