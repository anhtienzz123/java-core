package designpattern.test.structural.adapter.database;

public class OracleDBAdapter implements DatabaseExecutor {

	private OracleDB oracleDB;

	public OracleDBAdapter(OracleDB oracleDB) {
		this.oracleDB = oracleDB;
	}

	@Override
	public void executeQuery(String query) {
		query += " [Translated for Oracle]";
		oracleDB.executeOracleQuery(query);
	}

}
