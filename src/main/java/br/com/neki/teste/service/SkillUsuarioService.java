package br.com.neki.teste.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.neki.teste.domain.SkillUsuario;
import br.com.neki.teste.repository.SkillUsuarioRepository;

@Service
public class SkillUsuarioService {
	@Autowired
	SkillUsuarioRepository skillUsuarioRepository;
	
	public List<SkillUsuario> listarTodas(){
		return skillUsuarioRepository.findAll();
	}
	
	public Optional<SkillUsuario> listarPorId(Long id){
		return skillUsuarioRepository.findById(id);
	}
	
	public SkillUsuario inserir(SkillUsuario skillUsuario){
		return skillUsuarioRepository.save(skillUsuario);
	}
	
	public SkillUsuario atualizar(SkillUsuario skillUsuario) {
		return skillUsuarioRepository.saveAndFlush(skillUsuario);
	}
	
	public SkillUsuario deletar(Long id) {
		skillUsuarioRepository.deleteById(id);
		return null;
	}

}
