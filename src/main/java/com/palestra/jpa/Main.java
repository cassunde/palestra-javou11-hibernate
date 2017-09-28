package com.palestra.jpa;

import java.util.List;

import javax.enterprise.inject.se.SeContainer;
import javax.enterprise.inject.se.SeContainerInitializer;

import com.palesta.model.People;
import com.palestra.repository.Patientes;

public class Main {

	/*
	 * Essa classe executa a rotina mais correta para essa realidade, onde existe a necessidade apenas de exibir
	 * o nome do paciente e seu bairro
	 * 
	 * */
	
	public static void main(String[] args) {
		
		SeContainer container = SeContainerInitializer.newInstance().initialize();		
		Patientes repo = container.select(Patientes.class).get();
		
		List<People> lPeoples = repo.listPeoples();
		
		for (People people : lPeoples) {
			System.out.println("**********************************************");
			System.out.println("Pacinte: " + people.getPeople());
			System.out.println("Bairro: " + people.getNeighborhood().getNeighborhood());
			System.out.println("**********************************************");
		}
		
	}
}
