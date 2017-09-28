package com.palesta.model.equivocado;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the people database table.
 * 
 */
@Entity
@Table(name="people")
public class PeopleMore implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer pkpeople;

	@Temporal(TemporalType.DATE)
	private Date birthdate;

	private String cep;

	private String cnpj;

	private String complement;

	private String cpf;

	private Timestamp dateregister;

	private String endereco;

	private String father;

	private String login;

	private String mother;

	private String nickname;

	private String number;

	private String numberadvice;

	private String organissuer;

	private String password;

	private String people;

	private String photo;

	private Boolean repasse;

	private String rg;

	@Temporal(TemporalType.DATE)
	private Date rgdateemitter;

	private String rgemitter;

	private String sex;

	private Boolean supplier;

	//Não tenho a anotação lazy para simbolizar que não preciso deu bairro quando obter uma pessoa
	@ManyToOne
	@JoinColumn(name="fkneighborhood")
	private NeighborhoodMore neighborhood;

	public PeopleMore() {
	}

	public Integer getPkpeople() {
		return this.pkpeople;
	}

	public void setPkpeople(Integer pkpeople) {
		this.pkpeople = pkpeople;
	}

	public Date getBirthdate() {
		return this.birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public String getCep() {
		return this.cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCnpj() {
		return this.cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getComplement() {
		return this.complement;
	}

	public void setComplement(String complement) {
		this.complement = complement;
	}

	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Timestamp getDateregister() {
		return this.dateregister;
	}

	public void setDateregister(Timestamp dateregister) {
		this.dateregister = dateregister;
	}

	public String getEndereco() {
		return this.endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getFather() {
		return this.father;
	}

	public void setFather(String father) {
		this.father = father;
	}

	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getMother() {
		return this.mother;
	}

	public void setMother(String mother) {
		this.mother = mother;
	}

	public String getNickname() {
		return this.nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getNumber() {
		return this.number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getNumberadvice() {
		return this.numberadvice;
	}

	public void setNumberadvice(String numberadvice) {
		this.numberadvice = numberadvice;
	}

	public String getOrganissuer() {
		return this.organissuer;
	}

	public void setOrganissuer(String organissuer) {
		this.organissuer = organissuer;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPeople() {
		return this.people;
	}

	public void setPeople(String people) {
		this.people = people;
	}

	public String getPhoto() {
		return this.photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public Boolean getRepasse() {
		return this.repasse;
	}

	public void setRepasse(Boolean repasse) {
		this.repasse = repasse;
	}

	public String getRg() {
		return this.rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public Date getRgdateemitter() {
		return this.rgdateemitter;
	}

	public void setRgdateemitter(Date rgdateemitter) {
		this.rgdateemitter = rgdateemitter;
	}

	public String getRgemitter() {
		return this.rgemitter;
	}

	public void setRgemitter(String rgemitter) {
		this.rgemitter = rgemitter;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Boolean getSupplier() {
		return this.supplier;
	}

	public void setSupplier(Boolean supplier) {
		this.supplier = supplier;
	}

	public NeighborhoodMore getNeighborhood() {
		return this.neighborhood;
	}

	public void setNeighborhood(NeighborhoodMore neighborhood) {
		this.neighborhood = neighborhood;
	}

}