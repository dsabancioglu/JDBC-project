package newDemoJdbc;
//File'dan okuyarak atasin

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileConfigurationManager extends ConfigurationManager {
	
	public FileConfigurationManager() {
		Scanner sc;

				try {
					File file =new File("C:\\Users\\stj.dsabancioglu\\eclipse-workspace\\newDemoJdbc\\src\\Config.txt");
					sc = new Scanner(file);
						  
						    while (sc.hasNextLine()) {
						      setUrl(sc.nextLine());
						      setUserName(sc.nextLine());
						      setPassword(sc.nextLine());
						  }
					
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}			  
		
	}
	

}
