package tn.esprit.examen.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.examen.entities.Module;

@Repository
public interface ModuleRepository  extends CrudRepository<Module, Long>{

}
