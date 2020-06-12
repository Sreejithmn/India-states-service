package com.statewise.Indiastatedata.entity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"state",
"statecode",
"districtData"
})
public class CountryStateVO {

@JsonProperty("state")
private String state;
@JsonProperty("statecode")
private String statecode;
@JsonProperty("districtData")
private List<DistrictVO> districtData = null;

private int totalActive;

private int totalConfirmed;

private int totalDeceased;

private int totalRecovered;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("state")
public String getState() {
return state;
}

@JsonProperty("state")
public void setState(String state) {
this.state = state;
}

@JsonProperty("statecode")
public String getStatecode() {
return statecode;
}

@JsonProperty("statecode")
public void setStatecode(String statecode) {
this.statecode = statecode;
}

@JsonProperty("districtData")
public List<DistrictVO> getDistrictData() {
return districtData;
}

@JsonProperty("districtData")
public void setDistrictData(List<DistrictVO> districtData) {
this.districtData = districtData;
}

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

public int getTotalActive() {
	return totalActive;
}

public void setTotalActive(int totalActive) {
	this.totalActive = totalActive;
}

public int getTotalConfirmed() {
	return totalConfirmed;
}

public void setTotalConfirmed(int totalConfirmed) {
	this.totalConfirmed = totalConfirmed;
}

public int getTotalDeceased() {
	return totalDeceased;
}

public void setTotalDeceased(int totalDeceased) {
	this.totalDeceased = totalDeceased;
}

public int getTotalRecovered() {
	return totalRecovered;
}

public void setTotalRecovered(int totalRecovered) {
	this.totalRecovered = totalRecovered;
}

public void setAdditionalProperties(Map<String, Object> additionalProperties) {
	this.additionalProperties = additionalProperties;
}



}


