package com.statewise.Indiastatedata.controller;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.statewise.Indiastatedata.entity.CountryStateVO;
import com.statewise.Indiastatedata.entity.Datawrapper;
import com.statewise.Indiastatedata.entity.DistrictVO;
import com.statewise.Indiastatedata.repository.CountryStateRepo;

@RestController
@RequestMapping("/country")
@CrossOrigin
public class IndiaStateController {
	
	@Autowired
	CountryStateRepo countryrepo;

	@GetMapping(path = "/data",produces = MediaType.APPLICATION_JSON_VALUE)
	public Datawrapper getCountryData() throws JsonMappingException, JsonProcessingException {
		List<CountryStateVO> stateList = this.countryrepo.getCountryData();
		stateList.forEach(state->{
			state.setTotalActive(state.getDistrictData().stream().mapToInt(DistrictVO::getActive).sum());
			state.setTotalConfirmed(state.getDistrictData().stream().mapToInt(DistrictVO::getConfirmed).sum());
			state.setTotalDeceased(state.getDistrictData().stream().mapToInt(DistrictVO::getDeceased).sum());
			state.setTotalRecovered(state.getDistrictData().stream().mapToInt(DistrictVO::getRecovered).sum());
		});
		Datawrapper wrapper = new Datawrapper();
		wrapper.setStateList(stateList.stream().sorted(Comparator.comparing(CountryStateVO::getTotalConfirmed).reversed()).collect(Collectors.toList()));
		wrapper.setTotalActive(stateList.stream().mapToInt(CountryStateVO::getTotalActive).sum());
		wrapper.setTotalConfirmed(stateList.stream().mapToInt(CountryStateVO::getTotalConfirmed).sum());
		wrapper.setTotalDeceased(stateList.stream().mapToInt(CountryStateVO::getTotalDeceased).sum());
		wrapper.setTotalRecovered(stateList.stream().mapToInt(CountryStateVO::getTotalRecovered).sum());

		
		
		return wrapper;
	}
}
