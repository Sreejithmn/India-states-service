package com.statewise.Indiastatedata.entity;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"district",
"notes",
"active",
"confirmed",
"deceased",
"recovered",
"delta"
})
public class DistrictVO {

@JsonProperty("district")
private String district;
@JsonProperty("notes")
private String notes;
@JsonProperty("active")
private Integer active;
@JsonProperty("confirmed")
private Integer confirmed;
@JsonProperty("deceased")
private Integer deceased;
@JsonProperty("recovered")
private Integer recovered;

@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("district")
public String getDistrict() {
return district;
}

@JsonProperty("district")
public void setDistrict(String district) {
this.district = district;
}

@JsonProperty("notes")
public String getNotes() {
return notes;
}

@JsonProperty("notes")
public void setNotes(String notes) {
this.notes = notes;
}

@JsonProperty("active")
public Integer getActive() {
return active;
}

@JsonProperty("active")
public void setActive(Integer active) {
this.active = active;
}

@JsonProperty("confirmed")
public Integer getConfirmed() {
return confirmed;
}

@JsonProperty("confirmed")
public void setConfirmed(Integer confirmed) {
this.confirmed = confirmed;
}

@JsonProperty("deceased")
public Integer getDeceased() {
return deceased;
}

@JsonProperty("deceased")
public void setDeceased(Integer deceased) {
this.deceased = deceased;
}

@JsonProperty("recovered")
public Integer getRecovered() {
return recovered;
}

@JsonProperty("recovered")
public void setRecovered(Integer recovered) {
this.recovered = recovered;
}



@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}