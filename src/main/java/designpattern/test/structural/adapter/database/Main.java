package designpattern.test.structural.adapter.database;

public class Main {

	public static void main(String[] args) {
		String query = "SELECT * FROM users";
		
		DatabaseExecutor mysqlExecutor = new MySQLDBAdapter(new MySQLDBImpl());
		mysqlExecutor.executeQuery(query);
		
		DatabaseExecutor oracleExecutor = new OracleDBAdapter(new OracleDBImpl());
		oracleExecutor.executeQuery(query);
	}
}
