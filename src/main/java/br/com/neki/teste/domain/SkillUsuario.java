package br.com.neki.teste.domain;

import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "user_skill")
public class SkillUsuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private Usuario usuario;

	@ManyToOne
	@JoinColumn(name = "skill_id")
	private Skill skill;

	@Column(name = "knowledge_level")
	private Long nivelConhecimento;

	@Column(name = "created_at")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate createdAt;

	@Column(name = "updated_at")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate updateAt;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Skill getSkill() {
		return skill;
	}

	public void setSkill(Skill skill) {
		this.skill = skill;
	}

	public Long getNivelConhecimento() {
		return nivelConhecimento;
	}

	public void setNivelConhecimento(Long nivelConhecimento) {
		this.nivelConhecimento = nivelConhecimento;
	}

	public LocalDate getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDate createdAt) {
		this.createdAt = createdAt;
	}

	public LocalDate getUpdateAt() {
		return updateAt;
	}

	public void setUpdateAt(LocalDate updateAt) {
		this.updateAt = updateAt;
	}

	public SkillUsuario(Long id, Usuario usuario, Skill skill, Long nivelConhecimento, LocalDate createdAt,
			LocalDate updateAt) {
		super();
		this.id = id;
		this.usuario = usuario;
		this.skill = skill;
		this.nivelConhecimento = nivelConhecimento;
		this.createdAt = createdAt;
		this.updateAt = updateAt;
	}

	public SkillUsuario() {
		super();
	}

	@Override
	public int hashCode() {
		return Objects.hash(createdAt, id, nivelConhecimento, updateAt);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SkillUsuario other = (SkillUsuario) obj;
		return Objects.equals(createdAt, other.createdAt) && Objects.equals(id, other.id)
				&& Objects.equals(nivelConhecimento, other.nivelConhecimento)
				&& Objects.equals(updateAt, other.updateAt);
	}

}
