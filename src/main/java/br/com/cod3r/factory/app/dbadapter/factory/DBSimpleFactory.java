package br.com.cod3r.factory.app.dbadapter.factory;

import br.com.cod3r.factory.app.dbadapter.db.DB;
import br.com.cod3r.factory.app.dbadapter.db.OracleDB;
import br.com.cod3r.factory.app.dbadapter.db.PostgresDB;

public class DBSimpleFactory implements DBFactory{

	@Override
	public DB getDatabase(String type) {
		DB database = null;
		if("oracle".equals(type)) database = new OracleDB();
		else if("postgres".equals(type)) database = new PostgresDB();
		return database;
	}
	
}
