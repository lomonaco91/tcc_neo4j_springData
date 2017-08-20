package com.tccfl.controller;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.GET;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.tccfl.model.Aluno;
import com.tccfl.model.Habilidade;
import com.tccfl.service.AlunoService;

@Controller
public class ApplicationController {

    @Autowired
    AlunoService alunoService;

    @RequestMapping(value = "/")
    public String home(){

        return "home";
    }
    
    @GET
	@RequestMapping(value = "/newSave")
	public ResponseEntity<Aluno> saveAluno(){
		
		Aluno aluno = new Aluno();
		aluno.setName("FABIANO");
		
		List<Habilidade> habilidades =  new ArrayList<Habilidade>();
		
		Habilidade h1 = new Habilidade();
		h1.setName("JSF");
		h1.setNivelConhecimento(3);
		
		Habilidade h2 = new Habilidade();
		h2.setName("PRIMEFACES");
		h2.setNivelConhecimento(6);
		
		Habilidade h3 = new Habilidade();
		h3.setName("JAVA");
		h3.setNivelConhecimento(8);
		
		habilidades.add(h1);
		habilidades.add(h2);
		habilidades.add(h3);
		
		aluno.setTecs(habilidades);
		alunoService.saveAluno(aluno);
		
		return new ResponseEntity<Aluno>(aluno, HttpStatus.OK);
	}
}
