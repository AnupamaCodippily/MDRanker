package server;

public class Location {
	private String city;
	private String district;
	private String province;
	
	public Location (String city, String district, String province) {
		this.city = city;
		this.district = district;
		this.province = province;
	}
	
	public String getCity() {
		return city;
	}
	public String getDistrict() {
		return district;
	}
	public String getProvince() {
		return province;
	}
}
