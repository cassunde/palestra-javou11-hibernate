package com.palesta.model.equivocado;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.palesta.model.City;
import com.palesta.model.People;


/**
 * The persistent class for the neighborhood database table.
 * 
 */
@Entity
@Table(name="neighborhood")
public class NeighborhoodMore implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer pkneighborhood;

	private String neighborhood;

	//Não tenho a anotação lazy para simbolizar que não preciso de uma cidade sempre que obter um bairro
	@ManyToOne
	@JoinColumn(name="fkcity")
	private City city;

	@OneToMany(mappedBy="neighborhood")
	private List<People> peoples;

	public NeighborhoodMore() {
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

}