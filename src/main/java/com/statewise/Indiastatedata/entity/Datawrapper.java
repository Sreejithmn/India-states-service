package com.statewise.Indiastatedata.entity;

import java.util.List;

public class Datawrapper {

	private List<CountryStateVO> stateList;
	
	private int totalActive;

	private int totalConfirmed;

	private int totalDeceased;

	private int totalRecovered;

	

	public List<CountryStateVO> getStateList() {
		return stateList;
	}

	public void setStateList(List<CountryStateVO> stateList) {
		this.stateList = stateList;
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
	
	
	
}
