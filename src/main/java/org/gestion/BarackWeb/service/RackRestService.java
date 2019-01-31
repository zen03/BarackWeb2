package org.gestion.BarackWeb.service;

import java.util.List;

import org.gestion.BarackWeb.entities.Rack;
import org.gestion.BarackWeb.metier.RackMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RackRestService {
	@Autowired
	private RackMetier rackMetier;
	@RequestMapping(value="/racks",method=RequestMethod.POST)

	public Rack saveRack(@RequestBody Rack r) {
		return rackMetier.saveRack(r);
	}
	@RequestMapping(value="/racks",method=RequestMethod.GET)
	public List<Rack> listeRack() {
		return rackMetier.listeRack();
	}

}
