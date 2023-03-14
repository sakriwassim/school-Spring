package tn.esprit.examen.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.examen.entities.Etudiant;

@Repository
public interface EtudiantRepository  extends CrudRepository<Etudiant, Long>{

}
