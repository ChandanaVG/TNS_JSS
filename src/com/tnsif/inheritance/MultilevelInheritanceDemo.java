package com.tnsif.inheritance;

public class MultilevelInheritanceDemo {

	public static void main(String[] args) {
		City city = new City();
		city.setCityName("Nasik");
		city.setArea(264.2f);
		city.setStateName("Maharashtra");
		city.setLanguage("Marathi");
		city.setCountryName("India");
		city.setCapital("Delhi");
		System.out.println(city);
	}

}
