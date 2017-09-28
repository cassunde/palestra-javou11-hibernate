package com.palestra.repository;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.palesta.model.People;
import com.palesta.model.equivocado.PeopleMore;


public class Patientes {

	@Inject
	private EntityManager em;
	
	public List<People> listPeoples(){
		return em.createQuery(" select"
								+ " p"
							+ " from "
								+ " People p"
								+ " inner join  fetch p.neighborhood ",People.class).getResultList();
	}
	
	public List<PeopleMore> listPeoplesMore(){
		return em.createQuery(" select"
								+ " p"
							+ " from "
								+ " PeopleMore p ",PeopleMore.class).getResultList();
	}
	
	public List<People> listPeopleWithCity(){
		return em.createQuery("select"
								+ " p"
							+ " from"
								+ " People p"
								+ " inner join fetch p.neighborhood n"
								+ " inner join fetch n.city c ",People.class).getResultList();
	}
	
}
