package org.gestion.BarackWeb.metier;

import java.util.List;

import org.gestion.BarackWeb.dao.EntrepotRepository;
import org.gestion.BarackWeb.entities.Entrepot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EntrepotMetierImpl implements EntrepotMetier{
	@Autowired
 private EntrepotRepository entreporRepository;
	@Override
	public Entrepot saveEntrepot(Entrepot e) {
		// TODO Auto-generated method stub
		return entreporRepository.save(e);
	}

	@Override
	public List<Entrepot> listeEntrepot() {
		// TODO Auto-generated method stub
		return entreporRepository.findAll();
	}

}
