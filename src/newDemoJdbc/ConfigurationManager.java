package newDemoJdbc;
//Default olarak atasin
public class ConfigurationManager {

	private String url;
	private String userName;
	private String password;
	
	public ConfigurationManager(String url,String userName,String password) {
		this.url = url;
		this.userName = userName;
		this.password = password;
		
	}
	
	public ConfigurationManager() {
		this("jdbc:mysql://localhost:3306/kasifdb","root","dilara");
		
	}
	
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
