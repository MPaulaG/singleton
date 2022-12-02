package ec.edu.itsqmet.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "country")
public class CountryDTO {
	@Id
	private Integer id;
	private String name;
	private String description;
	private String code;
	
}

