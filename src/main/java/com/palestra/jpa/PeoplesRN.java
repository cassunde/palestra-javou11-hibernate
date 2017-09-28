package com.palestra.jpa;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import javax.inject.Inject;

import com.palesta.model.People;
import com.palestra.repository.Patientes;

public class PeoplesRN {

	@Inject
	Patientes patients;
	
	private List<DadoGeral> carregaDados(){
		
		List<People> listPeoples = patients.listPeoples();
		List<DadoGeral> resultado = new ArrayList<>();
				
		
		for (People people : listPeoples) {
			
			DadoGeral dado = new DadoGeral();
			dado.setNome(people.getPeople());
			dado.setEndereco(people.getEndereco());		
			dado.setBairro(people.getNeighborhood().getNeighborhood());
			dado.setMunicipio(people.getNeighborhood().getCity().getCep());
			dado.setEstado(people.getNeighborhood().getCity().getState().getState());
			
			resultado.add(dado);
		}
		
		return resultado;
	}
	
	public List<DadoGeral> getPeoplesFiltred(DadoGeral criterios){
		
		Predicate<DadoGeral> predicatePeoples = new Predicate<DadoGeral>() {
			
			@Override
			public boolean test(DadoGeral d) {
				if( d.equals(criterios) ) {
					return true;
				}
				return false;
			}
		};
		
		return carregaDados().stream().filter(predicatePeoples).collect(Collectors.toList());
				
	}
	
}
