package br.com.sinapsisenergia.helpdesk.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="USUARIO")
public class Usuario implements Serializable {

	private static final long serialVersionUID = 1456631124569822424L;

	@Id
	@Column(name="id_usuario")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	@JoinColumn(name="id_perfil")
	private Perfil perfil;
	
	@ManyToOne
	@JoinColumn(name="id_departamento")
	private Departamento departamento;
	
	private String nome;
	
	private String password;
	
	private String email;
	
	@ManyToMany(mappedBy="listaUsuarios", cascade={CascadeType.PERSIST, CascadeType.REMOVE})
	private Set<Empresa> listaEmpresas = new HashSet<>();
	
	@OneToMany(cascade={CascadeType.PERSIST, CascadeType.REMOVE}, mappedBy="usuario")
	private List<Telefone> telefone;
	
	public Usuario() {

	}

	public Usuario(Perfil perfil, Departamento departamento, String nome, String password, String email,
			Set<Empresa> listaEmpresas, List<Telefone> telefone) {
		this.perfil = perfil;
		this.departamento = departamento;
		this.nome = nome;
		this.password = password;
		this.email = email;
		this.listaEmpresas = listaEmpresas;
		this.telefone = telefone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Perfil getPerfil() {
		return perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Telefone> getTelefone() {
		return telefone;
	}

	public void setTelefone(List<Telefone> telefone) {
		this.telefone = telefone;
	}

	public Set<Empresa> getListaEmpresas() {
		return listaEmpresas;
	}

	public void setListaEmpresas(Set<Empresa> listaEmpresas) {
		this.listaEmpresas = listaEmpresas;
	}
	
}
