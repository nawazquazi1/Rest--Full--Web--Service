package com.webservice.versioning;

import com.webservice.filtering.*;
/**
 * @author nawaz
 */
public class PersonV2 {
	public  Name name;

	public PersonV2(Name name) {
		this.name = name;
	}

	public Name getName() {
		return name;
	}

	@Override
	public String toString() {
		return "PersonV2 [name=" + name + "]";
	}

}
