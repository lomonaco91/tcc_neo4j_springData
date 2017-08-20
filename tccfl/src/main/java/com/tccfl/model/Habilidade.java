package com.tccfl.model;

import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class Habilidade {
	
	private String name;
	private Long id;
	private int nivelConhecimento;
	
	public Habilidade (){}
	
	public Habilidade (Long id, String name, int nivelConhcimento){
		this.id = id;
		this.name = name;
		this.nivelConhecimento = nivelConhcimento;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getNivelConhecimento() {
		return nivelConhecimento;
	}

	public void setNivelConhecimento(int nivelConhecimento) {
		this.nivelConhecimento = nivelConhecimento;
	}
	
}
