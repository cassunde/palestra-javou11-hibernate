package com.palesta.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;


/**
 * The persistent class for the neighborhood database table.
 * 
 */
@Entity
@NamedQuery(name="Neighborhood.findAll", query="SELECT n FROM Neighborhood n")
public class Neighborhood implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer pkneighborhood;

	private String neighborhood;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="fkcity")
	private City city;

	@OneToMany(mappedBy="neighborhood")
	private List<People> peoples;

	public Neighborhood() {
	}

	public Integer getPkneighborhood() {
		return this.pkneighborhood;
	}

	public void setPkneighborhood(Integer pkneighborhood) {
		this.pkneighborhood = pkneighborhood;
	}

	public String getNeighborhood() {
		return this.neighborhood;
	}

	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}

	public City getCity() {
		return this.city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public List<People> getPeoples() {
		return this.peoples;
	}

	public void setPeoples(List<People> peoples) {
		this.peoples = peoples;
	}

	public People addPeople(People people) {
		getPeoples().add(people);
		people.setNeighborhood(this);

		return people;
	}

	public People removePeople(People people) {
		getPeoples().remove(people);
		people.setNeighborhood(null);

		return people;
	}

}