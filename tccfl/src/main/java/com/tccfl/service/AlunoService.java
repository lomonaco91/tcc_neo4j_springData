package com.tccfl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.tccfl.model.Aluno;
import com.tccfl.repo.AlunoRepo;

@Service
public class AlunoService {
	
	@Autowired
	AlunoRepo alunoRep;
	
	@Transactional
	public void saveAluno (Aluno aluno){
		alunoRep.save(aluno);
	}
	
	@Transactional
	public void deleteAluno(Aluno aluno){
		alunoRep.delete(aluno);
	}
	
	@Transactional
	public void updateAluno(Aluno aluno){
		alunoRep.save(aluno);
	}
	
	@Transactional
	public Aluno readByID(Long id){
		return alunoRep.findOne(id);
	}
}
