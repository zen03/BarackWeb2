package org.gestion.BarackWeb.metier;

import java.util.List;

import org.gestion.BarackWeb.entities.Etiquette;

public interface EtiquetteMetier {
public Etiquette saveEtiquette(Etiquette et);
public List<Etiquette>listeEtiquette();
}
