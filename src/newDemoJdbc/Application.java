package newDemoJdbc;

import java.sql.SQLException;

public class Application {
	
	DBConnector dbConnector;

	public static void main(String[] args) {
		FileConfigurationManager fcm = new FileConfigurationManager();
		DBConnector dbConnector = new DBConnector(fcm);
		

		String showDbQuery = "select * from kasifdb.team";
		//String insertDbQuery = "insert into kasifdb.team (id,Name,Surname,Age ,Experience) values (6,'Akdeniz Kutay','Öçal',23,0)";
		//String updateDbQuery = "update team set Surname='dağüstün' where id=2";
		//String deleteDbQuery = "delete from team where id=5";
		//Prepared
		//String showDbPrepared = "select * from kasifdb.team where Name=?";
		//String value = "Esra";
		
		try {
		
		
		//dbConnector.insertDatabase(insertDbQuery);

			dbConnector.showDatabase(showDbQuery);

		
		//dbConnector.updateDatabase(updateDbQuery);
		//dbConnector.showDatabase(showDbQuery);
		System.out.println("\n\n");
		
		//dbConnector.deleteFromDatabase(deleteDbQuery);
		//dbConnector.showDatabase(showDbQuery);
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
