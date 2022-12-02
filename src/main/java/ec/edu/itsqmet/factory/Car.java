package ec.edu.itsqmet.factory;

public abstract class Car {
	private int year;
	
	
	public int getYear() { //retorna un valor 
		return year;
	}
	
	public void setYear(int year) { //set-modificar la informacion 
		this.year=year;
	}
	public String maxSpeed() {
		return "  km/h";
	}
	

}
