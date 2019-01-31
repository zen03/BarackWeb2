package org.gestion.BarackWeb.dao;


import org.gestion.BarackWeb.entities.Mouvement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MouvementRepository  extends JpaRepository<Mouvement, Long>{

}
