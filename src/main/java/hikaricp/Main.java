package hikaricp;

import java.io.PrintWriter;
import java.sql.ResultSet;
import java.util.Properties;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class Main {

	public static void main(String[] args) {
		Properties props = new Properties();
		props.setProperty("dataSourceClassName", "org.postgresql.ds.PGSimpleDataSource");
		props.setProperty("dataSource.user", "test");
		props.setProperty("dataSource.password", "test");
		props.setProperty("dataSource.databaseName", "mydb");
		props.put("dataSource.logWriter", new PrintWriter(System.out));

		HikariConfig config = new HikariConfig(props);
		HikariDataSource ds = new HikariDataSource(config);
	}
}
