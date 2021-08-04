package newDemoJdbc;

import java.sql.*;

public class DBConnector {
	private FileConfigurationManager fileConfigurationManager;
	private Connection connection;
	private Statement statement;

	public DBConnector(FileConfigurationManager fcm) {
		fileConfigurationManager = fcm;
		try {
			connection = DriverManager.getConnection(fileConfigurationManager.getUrl(),fileConfigurationManager.getUserName(), fileConfigurationManager.getPassword());
			statement = connection.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void showDatabase(String query) throws SQLException {
		ResultSet result = statement.executeQuery(query);
		while (result.next()) {
			System.out.println(result.getString("id") + " " + result.getString("Name") + " " + result.getString("Surname")
							+ " " + result.getString("Age") + " " + result.getString("Experience"));
		}
	}

	public void showDatabasePrepared(String query, String value) throws SQLException {
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1, value);
		ResultSet result = preparedStatement.executeQuery(); // default olarak ilk satır myRs'e alınıyor.
		while (result.next()) {
			System.out
					.println(result.getString("id") + " " + result.getString("Name") + " " + result.getString("Surname")
							+ " " + result.getString("Age") + " " + result.getString("Experience"));
		}
	}

	public void insertDatabase(String query) throws SQLException {
		statement.executeUpdate(query);
		System.out.println("Insert Completed..");
	}

	public void updateDatabase(String query) throws SQLException {
		statement.executeUpdate(query);
		System.out.println("Update Completed..");
	}

	public void deleteFromDatabase(String query) throws SQLException {
		int rowsAffected = statement.executeUpdate(query); // rowsAffected'ta kaç satır silindiğini görüyoruz
		System.out.println("Rows Affected: " + rowsAffected);
	}
}
