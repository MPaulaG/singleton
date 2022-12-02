package ec.edu.itsqmet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.edu.itsqmet.dto.CountryDTO;

public interface ICountryRepository extends JpaRepository<CountryDTO, Integer> {

}
