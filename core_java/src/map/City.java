package map;

import java.util.HashMap;
import java.util.Map;

public class City {
	
	

	public City(int id, String cityname, int pincode) {
		super();
		this.id = id;
		this.cityname = cityname;
		this.pincode = pincode;
	}
	
	@Override
	public String toString() {
		return "City [id=" + id + ", cityname=" + cityname + ", pincode=" + pincode + "]\n";
	}

	int id;
	String cityname;
	int pincode;
	
	public static void main(String[] args) {
		
		City c1=new City(10,"pune",411048);
		City c2=new City(102,"solapur",410982);
		City c3=new City(103,"satara",283922);
		City c4=new City(104,"mumbai",239399);
		City c5=new City(105,"ahmedabad",410039);
		
		Map<Integer, City> m= new HashMap<Integer, City>();
		m.put(c1.id, c1);
		m.put(c2.id, c2);
		m.put(c3.id, c3);
		m.put(c4.id, c4);
		m.put(c5.id, c5);
		m.put(c2.id, c3);
		
		System.out.println(m);
		
	}

	
}
