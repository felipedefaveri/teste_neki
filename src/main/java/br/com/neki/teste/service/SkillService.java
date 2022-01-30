package br.com.neki.teste.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.neki.teste.domain.Skill;
import br.com.neki.teste.repository.SkillRepository;


@Service
public class SkillService {

	@Autowired
	SkillRepository skillRepository;
	
	public List<Skill> listarTodas(){
		return skillRepository.findAll();
	}
	
	public Optional<Skill> listarPorId(Long id){
		return skillRepository.findById(id);
	}
	
	public Skill inserir(Skill skill){
		return skillRepository.save(skill);
	}
	
	public Skill atualizar(Skill skill) {
		return skillRepository.saveAndFlush(skill);
	}
	
	public Skill deletar(Long id) {
		skillRepository.deleteById(id);
		return null;
	}
	
}
