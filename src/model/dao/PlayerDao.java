package model.dao;

import java.util.List;

import model.entties.Player;
import model.entties.Team;

public interface PlayerDao {
	
	void insert (Player obj);
	
	void update (Player obj);
	
	void deleteById(Integer id);
	
	Player findById(Integer id);
	
	List<Player> findByTeam(Team team);
	
	List<Player> findAll();
}
