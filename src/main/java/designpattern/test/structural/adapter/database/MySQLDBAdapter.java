package designpattern.test.structural.adapter.database;

public class MySQLDBAdapter implements DatabaseExecutor {

	private MySQLDB mySQLDB;
	
	public MySQLDBAdapter(MySQLDB mySQLDB) {
		this.mySQLDB = mySQLDB;
	}
	
	@Override
	public void executeQuery(String query) {
		query += " [Translated for MySQL]";
		mySQLDB.executeMySQLQuery(query);	
	}

}
