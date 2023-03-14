package tn.esprit.examen.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import tn.esprit.examen.entities.Cours;

@Repository
public interface CoursRepository extends CrudRepository<Cours, Long> {
	@Query("Select c from Cours c where c.module.idModule=:idModule")
	List<Cours> listeCoursParModule(@Param("idModule") Long idModule) ;
}
