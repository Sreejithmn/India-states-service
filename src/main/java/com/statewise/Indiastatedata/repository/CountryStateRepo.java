package com.statewise.Indiastatedata.repository;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.statewise.Indiastatedata.entity.CountryStateVO;
import com.statewise.Indiastatedata.entity.Datawrapper;

@Repository
public class CountryStateRepo {

	@Autowired
	RestTemplate template;
	
	
	public List<CountryStateVO> getCountryData() {
		ResponseEntity<CountryStateVO[]> response = this.template.getForEntity("https://api.covid19india.org/v2/state_district_wise.json", CountryStateVO[].class);
		return Arrays.asList(response.getBody());
	}

}
