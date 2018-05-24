package br.com.sinapsisenergia.helpdesk.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name="T_PS_USUARIO")
@Entity
public class Usuario {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_usuario")
	private int id;
	
	@Column(name="nm_usuario", nullable=false, length=150)
	private String nome;
	
	@Column(name="ps_usuario", nullable=false, length=30)
	private String senha;
	
	@Column(name="ds_email", length=100, nullable=false, unique=true)
	private String email;

	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="nr_telefone")
	private Telefone telefone;
	
	@Column(name="ds_perfil", nullable=false, length=25)
	@Enumerated(EnumType.STRING)
	private Perfil perfil;
	
	@ManyToMany
	@JoinTable(name = "UsuarioEmpresa", 
	   joinColumns = {@JoinColumn(name = "id_usuario", nullable = false) },
	   inverseJoinColumns = {@JoinColumn(name = "empresa_id", nullable = false)})
	private Set<Empresa> empresa = new HashSet<Empresa>();
	
	public Usuario() {

	}

	public Usuario(String nome, String senha, String email, Telefone telefone, Perfil perfil, Set<Empresa> empresa) {
		super();
		this.nome = nome;
		this.senha = senha;
		this.email = email;
		this.telefone = telefone;
		this.perfil = perfil;
		this.empresa = empresa;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Telefone getTelefone() {
		return telefone;
	}

	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}

	public Perfil getPerfil() {
		return perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}

	public Set<Empresa> getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Set<Empresa> empresa) {
		this.empresa = empresa;
	}

}
