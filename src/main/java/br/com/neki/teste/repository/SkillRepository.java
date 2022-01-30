package br.com.neki.teste.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.neki.teste.domain.Skill;

public interface SkillRepository extends JpaRepository<Skill, Long>{

}
