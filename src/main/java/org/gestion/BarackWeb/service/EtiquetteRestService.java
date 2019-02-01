package org.gestion.BarackWeb.service;

import java.util.List;

import org.gestion.BarackWeb.entities.Etiquette;
import org.gestion.BarackWeb.metier.EtiquetteMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EtiquetteRestService {
	@Autowired
	private EtiquetteMetier etiquetteMeteir;
	
	@RequestMapping(value="/etiquettes",method=RequestMethod.POST)
	public Etiquette saveEtiquette(@RequestBody Etiquette et) {
		return etiquetteMeteir.saveEtiquette(et);
	}
	@RequestMapping(value="/etiquettes",method=RequestMethod.GET)
	public List<Etiquette> listeEtiquette() {
		return etiquetteMeteir.listeEtiquette();
	}

}
