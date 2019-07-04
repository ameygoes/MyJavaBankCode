package Amey;

public class Address {
	private String city,state;
	private int zipCode ;
	Address(){};
	
	Address(String city,String state,int zipCode)
	{
		this.city = city;
		this.state = state;
		this.zipCode=zipCode;
	}
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	
	
	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
}
