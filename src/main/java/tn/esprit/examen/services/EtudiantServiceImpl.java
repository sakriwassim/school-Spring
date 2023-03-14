package tn.esprit.examen.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import tn.esprit.examen.entities.Cours;
import tn.esprit.examen.entities.Etudiant;
import tn.esprit.examen.repositories.CoursRepository;
import tn.esprit.examen.repositories.EtudiantRepository;
@Service
@Slf4j
public class EtudiantServiceImpl implements IEtudiantService {
	
	@Autowired
	EtudiantRepository etudiantRepository;
	@Autowired
	CoursRepository coursRepository;
	
	
	@Override
	public void ajouterEtudiant(Etudiant etudiant) {
		etudiantRepository.save(etudiant);	
		
	}

	@Override
	public void affecterEtudiantAucours(Long idEtudiant, Long idCours) {
		Etudiant e =etudiantRepository.findById(idEtudiant).orElse(null);
		Cours c=coursRepository.findById(idCours).orElse(null);
		log.info("etudiant: "+e.getPrenom());
		log.info("cours: "+c.getLibelle());
		c.getEtudiants().add(e);
		coursRepository.save(c);
		
		
	}
	

}
