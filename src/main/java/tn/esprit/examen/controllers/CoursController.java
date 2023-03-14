package tn.esprit.examen.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import tn.esprit.examen.entities.Cours;
import tn.esprit.examen.services.ICoursService;

@RestController
@RequestMapping("/cours")
public class CoursController {
	@Autowired
	ICoursService coursService;
	
	// http://localhost:8086/SpringMVC/cours/listeCoursParModule/1
		@ApiOperation(value = "Récuperer la liste des cours par module")
		@GetMapping("/listeCoursParModule/{id-module}")
		@ResponseBody
		public List<Cours> listeCoursParModule(@PathVariable("id-module") Long idModule){
			return coursService.listeCoursParModule(idModule);
		}

}
