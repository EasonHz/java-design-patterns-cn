package com.hz.state2;

import lombok.Data;
import lombok.ToString;

/**
 * @author hz
 */
@Data
@ToString
public class Location {

	protected String code;
	protected String address;
	protected String area;
	protected String city;
	protected String country;
	protected String zipCode;

	public Location(String code, String address, String area, String city, String country, String zipCode) {
		super();
		this.code = code;
		this.address = address;
		this.area = area;
		this.city = city;
		this.country = country;
		this.zipCode = zipCode;
	}

}
