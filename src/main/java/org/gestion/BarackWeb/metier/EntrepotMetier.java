package org.gestion.BarackWeb.metier;

import java.util.List;

import org.gestion.BarackWeb.entities.Entrepot;

public interface EntrepotMetier {
public Entrepot saveEntrepot(Entrepot e);
public List<Entrepot> listeEntrepot();
}
