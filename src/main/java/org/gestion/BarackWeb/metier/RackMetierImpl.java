package org.gestion.BarackWeb.metier;

import java.util.List;

import org.gestion.BarackWeb.dao.RackRepository;
import org.gestion.BarackWeb.entities.Rack;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class RackMetierImpl implements RackMetier{
	@Autowired
	private RackRepository rackRepository;
	@Override
	public Rack saveRack(Rack r) {
		// TODO Auto-generated method stub
		return rackRepository.save(r);
	}

	@Override
	public List<Rack> listeRack() {
		// TODO Auto-generated method stub
		return rackRepository.findAll();
	}

}
