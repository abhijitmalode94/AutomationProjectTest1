package JavaSessions;

public class Encapsulation {
	
	
	
	private String name;
	private String urname;
	private String password;
	
	public String getUrname() {
		return urname;
	}

	public void setUrname(String urname) {
		this.urname = urname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public static void main(String[]args)
	{
		Encapsulation encp=new Encapsulation();
		
		encp.setName("Abhijit");
		encp.setUrname("amalode94");
		encp.setPassword("Test@12345689");
		 
		System.out.println(encp.getName());
		System.out.println(encp.getPassword());
		System.out.println(encp.getUrname());
	}
		


	}


