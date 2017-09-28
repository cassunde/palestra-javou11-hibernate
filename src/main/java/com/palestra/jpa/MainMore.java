package com.palestra.jpa;

import java.util.List;

import javax.enterprise.inject.se.SeContainer;
import javax.enterprise.inject.se.SeContainerInitializer;

import com.palesta.model.equivocado.PeopleMore;
import com.palestra.repository.Patientes;

public class MainMore {

	/*
	 * Essa classe executa a rotina simulando uma configuração de equivocada ocasionando e vários selects 
	 * 
	 * */
	
	public static void main(String[] args) {
		
		SeContainer container = SeContainerInitializer.newInstance().initialize();		
		Patientes repo = container.select(Patientes.class).get();
		
		List<PeopleMore> lPeoples = repo.listPeoplesMore();
		
		for (PeopleMore people : lPeoples) {
			System.out.println("**********************************************");
			System.out.println("Pacinte: " + people.getPeople());
			System.out.println("Bairro: " + people.getNeighborhood().getNeighborhood());
			System.out.println("**********************************************");
		}
		
	}
}
