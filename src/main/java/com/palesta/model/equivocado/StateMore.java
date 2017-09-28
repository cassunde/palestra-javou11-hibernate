package com.palesta.model.equivocado;

import java.io.Serializable;
import javax.persistence.*;

import com.palesta.model.City;

import java.util.List;


/**
 * The persistent class for the state database table.
 * 
 */
@Entity
public class StateMore implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer pkstate;

	private String codibge;

	private String codstate;

	private String initials;

	private String state;

	//bi-directional many-to-one association to City
	@OneToMany(mappedBy="state")
	private List<City> cities;


	public StateMore() {
	}

	public void setPkstate(Integer pkstate) {
		this.pkstate = pkstate;
	}

	public String getCodibge() {
		return this.codibge;
	}

	public void setCodibge(String codibge) {
		this.codibge = codibge;
	}

	public String getCodstate() {
		return this.codstate;
	}

	public void setCodstate(String codstate) {
		this.codstate = codstate;
	}

	public String getInitials() {
		return this.initials;
	}

	public void setInitials(String initials) {
		this.initials = initials;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public List<City> getCities() {
		return this.cities;
	}

	public void setCities(List<City> cities) {
		this.cities = cities;
	}
	
}