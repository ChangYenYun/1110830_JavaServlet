package MVC.Restaurant.Model;

public class Consumer {
	
	private Integer id;
	private String username;
	private String password;
	private String name;
	private String phone;
	private String address;
	
	public Consumer() {
		super();
	}

	

	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public Consumer(String username, String password, String name, String phone, String address) {
		super();
		this.username = username;
		this.password = password;
		this.name = name;
		this.phone = phone;
		this.address = address;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		address = address;
	}
	
	
	

}
