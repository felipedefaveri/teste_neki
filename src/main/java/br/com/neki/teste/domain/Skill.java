package br.com.neki.teste.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;


@Entity
@Table(name="skill")
public class Skill {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private Long idSkill;
	
	@Column(name="name")
	private String nome;
	
	@Column(name="version")
	private String versao;
	
	@Column(name="description")
	private String descricao;
	
	@Column(name="image_url")
	private String imagem;

	public Long getIdSkill() {
		return idSkill;
	}

	public void setIdSkill(Long idSkill) {
		this.idSkill = idSkill;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getVersao() {
		return versao;
	}

	public void setVersao(String versao) {
		this.versao = versao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}

	public Skill(Long idSkill, String nome, String versao, String descricao, String imagem) {
		super();
		this.idSkill = idSkill;
		this.nome = nome;
		this.versao = versao;
		this.descricao = descricao;
		this.imagem = imagem;
	}

	public Skill() {
		super();
	}
	
	

	}