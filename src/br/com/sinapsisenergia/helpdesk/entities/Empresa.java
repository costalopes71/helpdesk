package br.com.sinapsisenergia.helpdesk.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="EMPRESA")
public class Empresa {

	@Id
	@Column(name="id_empresa")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="id_empresa_pai")
	private int idEmpresaPai;
	
	private String nome;
	
	@ManyToMany(cascade={CascadeType.PERSIST, CascadeType.REMOVE})
	@JoinTable(name = "USUARIO_EMPRESA", 
	   joinColumns = {@JoinColumn(name = "id_empresa")},
	   inverseJoinColumns = {@JoinColumn(name = "id_usuario")})
	private Set<Usuario> listaUsuarios = new HashSet<>();
	
	@OneToOne(mappedBy="empresa", cascade={CascadeType.PERSIST, CascadeType.REMOVE})
	private Endereco endereco;
	
//	@ManyToMany
//	@JoinTable(name = "EMPRESA_PRODUTO",  
//	   joinColumns = {@JoinColumn(name = "id_empresa")},
//	   inverseJoinColumns = {@JoinColumn(name = "id_produto")})
//	private Set<Produto> listaProdutos = new HashSet<>();
	
	@OneToMany(mappedBy="empresa", cascade={CascadeType.PERSIST, CascadeType.REMOVE})
	private Set<EmpresaProduto> empresaProduto = new HashSet<>();
	
	public Empresa() {

	}

	public Empresa(int idEmpresaPai, String nome, Endereco endereco, Set<EmpresaProduto> empresaProduto) {
		this.idEmpresaPai = idEmpresaPai;
		this.nome = nome;
		this.endereco = endereco;
		this.empresaProduto = empresaProduto;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdEmpresaPai() {
		return idEmpresaPai;
	}

	public void setIdEmpresaPai(int idEmpresaPai) {
		this.idEmpresaPai = idEmpresaPai;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<Usuario> getListaUsuarios() {
		return listaUsuarios;
	}

	public void setListaUsuarios(Set<Usuario> listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Set<EmpresaProduto> getEmpresaProduto() {
		return empresaProduto;
	}

	public void setEmpresaProduto(Set<EmpresaProduto> empresaProduto) {
		this.empresaProduto = empresaProduto;
	}

//	public Set<Produto> getListaProdutos() {
//		return listaProdutos;
//	}
//
//	public void setListaProdutos(Set<Produto> listaProdutos) {
//		this.listaProdutos = listaProdutos;
//	}

}
