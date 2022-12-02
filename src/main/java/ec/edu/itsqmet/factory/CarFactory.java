package ec.edu.itsqmet.factory;

public class CarFactory {
	public static Car newCar(String carType) { // modificador tipo de dato nombre funcion = firma metodo
		if (carType.equals("Nissan")) {
			return new Nissan();// instancia-crear un objeto
		}
		if (carType.equals("Toyota")) {
			return new Toyota();
		}
		if (carType.equals("Honda")) {
			return new Honda();
		}
		return null;
	}
}
