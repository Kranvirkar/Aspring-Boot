package in.nit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "CITIES_MASTER")
public class City {

	@Id
	@GeneratedValue
	@Column(name = "CITY_ID")
	private Integer cityId;
	
	@Column(name = "STATE_ID")
	private Integer stateId;
	
	@Column(name = "CITY_NAME")
	private String cityName;
	
	
	
}