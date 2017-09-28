package com.palestra.jpa;

import java.util.List;

import javax.enterprise.inject.se.SeContainer;
import javax.enterprise.inject.se.SeContainerInitializer;

public class Filter {

	public static void main(String[] args) {
		
		SeContainer ctx = SeContainerInitializer.newInstance().initialize();
		PeoplesRN peopleRN = ctx.select(PeoplesRN.class).get();
		
		DadoGeral filtro = new DadoGeral();
		filtro.setNome("MA");
		
		List<DadoGeral> registrosFiltrados = peopleRN.getPeoplesFiltred(filtro);
		
		System.out.println(registrosFiltrados.size());
		
	}	
}