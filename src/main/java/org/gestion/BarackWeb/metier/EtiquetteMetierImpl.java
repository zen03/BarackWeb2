package org.gestion.BarackWeb.metier;

import java.util.List;

import org.gestion.BarackWeb.dao.EtiquetteRepository;
import org.gestion.BarackWeb.entities.Etiquette;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EtiquetteMetierImpl implements EtiquetteMetier{
	@Autowired
	private EtiquetteRepository etiquetteRepository;

	@Override
	public Etiquette saveEtiquette(Etiquette et) {
		// TODO Auto-generated method stub
		return etiquetteRepository.save(et);
	}

	@Override
	public List<Etiquette> listeEtiquette() {
		// TODO Auto-generated method stub
		return etiquetteRepository.findAll();
	}

}
