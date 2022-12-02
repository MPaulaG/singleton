package ec.edu.itsqmet;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import ec.edu.itsqmet.factory.Car;
import ec.edu.itsqmet.factory.CarFactory;
import ec.edu.itsqmet.factory.Honda;
import ec.edu.itsqmet.factory.Nissan;
import ec.edu.itsqmet.factory.Toyota;
import ec.edu.itsqmet.repository.ICountryRepository;
import ec.edu.itsqmet.singleton.CountrySingleton;

@SpringBootTest
class SingletonApplicationTests {
	@Autowired
	private ICountryRepository countryRepository;

	// @Test
	void contextLoads() {
		// countryRepository.count();
		// CountryDTO cdto= new CountryDTO(); //constructor vacio
		// System.out.println(countryRepository.count());
		// assertEquals(2, countryRepository.count());
		// System.out.print("instancia 1"+ CountrySingleton.getInstance());
		// CountrySingleton.getInstance();
		for (int i = 0; i <= 500; i = i + 1) {
			// System.out.print(countryRepository.count());
			System.out.println(CountrySingleton.getTotalCountries(countryRepository));
		}

	}

	@Test
	void testingFactory() {
		// Car car= new Car(); no permite instanciar objetos la clase abstracta
		Car ns80 = CarFactory.newCar("Nissan");
		// ns.getYear();
		System.out.println("Nissan de " +ns80.getYear()+ " " + ns80.maxSpeed());
		ns80.setYear(1980);
		System.out.println("Nissan de " +ns80.getYear()+ " " + ns80.maxSpeed());
		//int juan = 3; variable
		

		Car ns75 = CarFactory.newCar("Nissan");
		ns75.setYear(1975);
		System.out.println("Nissan de " +ns75.getYear()+ " " + ns75.maxSpeed());
		
		Car ns86 = CarFactory.newCar("Nissan");
		ns86.setYear(1986);
		System.out.println("Nissan de " +ns86.getYear()+ " " + ns86.maxSpeed());
		
		Car ty83= CarFactory.newCar("Toyota");
		ty83.setYear(1983);
		System.out.println("Toyota de " +ty83.getYear()+ " " + ty83.maxSpeed());
		
		Car ty91= CarFactory.newCar("Toyota");
		ty91.setYear(1991);
		System.out.println("Toyota de " + ty91.getYear()+ " " + ty91.maxSpeed());
		
		Car vo= CarFactory.newCar("	Volvo");
		System.out.println("Volvo de " + vo.maxSpeed());
		
	//crear enumeradores para mejorar el factory
	
	}

}
