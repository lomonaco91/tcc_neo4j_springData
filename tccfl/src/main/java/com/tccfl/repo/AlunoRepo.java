package com.tccfl.repo;

import java.util.List;
import org.springframework.data.neo4j.repository.GraphRepository;
import com.tccfl.model.Aluno;

public interface AlunoRepo extends GraphRepository<Aluno> {
	
	List<Aluno> findByName(String name);

}

