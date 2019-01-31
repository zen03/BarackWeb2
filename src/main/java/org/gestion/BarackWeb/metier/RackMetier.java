package org.gestion.BarackWeb.metier;

import java.util.List;

import org.gestion.BarackWeb.entities.Rack;

public interface RackMetier {
	
public Rack saveRack(Rack r);
public List<Rack> listeRack();

}
