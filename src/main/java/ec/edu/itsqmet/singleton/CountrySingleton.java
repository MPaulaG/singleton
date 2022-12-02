package ec.edu.itsqmet.singleton;

import ec.edu.itsqmet.repository.ICountryRepository;

public class CountrySingleton {
	private static CountrySingleton instance;//es un atributo
	private static long totalCountries;
	private CountrySingleton() {
	}
	public static CountrySingleton getInstance() {
		if (instance==null) {
			instance=new CountrySingleton();
			System.out.println("Crando instancia");
		}
		return instance;
		
	}
	public static long getTotalCountries (ICountryRepository countryRepository){
		if(totalCountries==0) {
			totalCountries= countryRepository.count();
		}
		return totalCountries;
	}

}
