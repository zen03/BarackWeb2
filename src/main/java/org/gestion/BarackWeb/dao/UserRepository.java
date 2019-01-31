package org.gestion.BarackWeb.dao;


import org.gestion.BarackWeb.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User, Long>{

}
