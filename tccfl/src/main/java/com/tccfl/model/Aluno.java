package com.tccfl.model;

import java.util.List;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

@NodeEntity
public class Aluno {
	
	private String name;
	private Long id;
	
	@Relationship(type = "KNOWS", direction = "OUTGOING")
	private List<Habilidade> tecs;
	
	public Aluno (){}
	
	public Aluno (Long id, String name, List<Habilidade> tecs){
		this.id = id;
		this.name = name;
		this.tecs = tecs;
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

	public List<Habilidade> getTecs() {
		return tecs;
	}

	public void setTecs(List<Habilidade> tecs) {
		this.tecs = tecs;
	}
	
}
