package org.gestion.BarackWeb.service;

import java.util.List;

import org.gestion.BarackWeb.entities.Entrepot;
import org.gestion.BarackWeb.metier.EntrepotMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EntrepotRestService {
@Autowired
private EntrepotMetier entrepotMetier;
@RequestMapping(value="/entrepots",method=RequestMethod.POST)
public Entrepot saveEntrepot(@RequestBody Entrepot e) {
	return entrepotMetier.saveEntrepot(e);
}
@RequestMapping(value="/entrepots",method=RequestMethod.GET)
public List<Entrepot> listeEntrepot() {
	return entrepotMetier.listeEntrepot();
}
}
