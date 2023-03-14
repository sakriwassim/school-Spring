package tn.esprit.examen.services;

import java.util.List;

import tn.esprit.examen.entities.Cours;

public interface ICoursService {
	
	List<Cours> listeCoursParModule(Long idModule);
	

}
