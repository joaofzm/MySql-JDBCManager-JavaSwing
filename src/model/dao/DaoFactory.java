package model.dao;

import controller.DBConnector;
import model.dao.implementations.PlayerDaoJDBC;

public class DaoFactory {

	public static PlayerDao createPlayerDaoJDBC() {
		return new PlayerDaoJDBC(DBConnector.getConnection());
	}
}
