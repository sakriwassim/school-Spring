package tn.esprit.examen.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.examen.entities.Cours;
import tn.esprit.examen.entities.Module;
import tn.esprit.examen.repositories.CoursRepository;
import tn.esprit.examen.repositories.ModuleRepository;

@Service
public class CoursServiceImpl  implements ICoursService {
	@Autowired
	CoursRepository coursRepository;
	

	@Override
	public List<Cours> listeCoursParModule(Long idModule) {
		List<Cours> coursParModule=(List<Cours>) coursRepository.listeCoursParModule(idModule);
		return coursParModule ;
	}

}
