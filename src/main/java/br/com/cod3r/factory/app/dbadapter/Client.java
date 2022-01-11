package br.com.cod3r.factory.app.dbadapter;

import br.com.cod3r.factory.app.dbadapter.db.DB;
import br.com.cod3r.factory.app.dbadapter.factory.DBSimpleFactory;

public class Client {

	public static void main(String[] args) {
		DB db1, db2;
		DBSimpleFactory factory = new DBSimpleFactory();
		
		db1 = factory.getDatabase("oracle");
		db2 = factory.getDatabase("postgres");
		
		db1.update("asdasd");
		db2.update("asdasd");
	}
}
