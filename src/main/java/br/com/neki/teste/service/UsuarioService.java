package br.com.neki.teste.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.neki.teste.domain.Usuario;
import br.com.neki.teste.repository.UsuarioRepository;
import javassist.NotFoundException;

@Service
public class UsuarioService {

	@Autowired
	UsuarioRepository usuarioRepository;
	
;
	
	public List<Usuario> listarTodas(){
		return usuarioRepository.findAll();
	}
	
	public Optional<Usuario> listarPorId(Long id){
		return usuarioRepository.findById(id);
	}
	
	public Usuario inserir(Usuario usuario){
		return usuarioRepository.save(usuario);
	}
	
	public Usuario atualizar(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
	
	public Usuario deletar(Long id) {
		usuarioRepository.deleteById(id);
		return null;
	}
}