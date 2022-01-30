package br.com.neki.teste.domain;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private Long IdUsuario;
	
	@Column(name="login")
	private String Login;
	
	@Column(name="password")
	private String Password;
	
	@Column(name="last_login_date")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private LocalDate DataUltimoLogin;

	public Long getIdUsuario() {
		return IdUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		IdUsuario = idUsuario;
	}

	public String getLogin() {
		return Login;
	}

	public void setLogin(String login) {
		Login = login;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public LocalDate getDataUltimoLogin() {
		return DataUltimoLogin;
	}

	public void setDataUltimoLogin(LocalDate dataUltimoLogin) {
		DataUltimoLogin = dataUltimoLogin;
	}

	public Usuario(Long idUsuario, String login, String password, LocalDate dataUltimoLogin) {
		super();
		IdUsuario = idUsuario;
		Login = login;
		Password = password;
		DataUltimoLogin = dataUltimoLogin;
	}

	public Usuario() {
		super();
	}

	
}
