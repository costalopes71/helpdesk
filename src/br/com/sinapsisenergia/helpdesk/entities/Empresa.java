package br.com.sinapsisenergia.helpdesk.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table(name="T_PS_EMPRESA")
@Entity
public class Empresa {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_empresa")
	private int id;
	
	@Column(name="ds_razao_social", nullable=false, length=150)
	private String razaoSocial;
	
	@Column(name="nm_fantasia", nullable=false, length=100)
	private String nomeFantasia;
	
	@Column(name="nr_cnpj", length=22)
	private String cnpj;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="cd_endereco")
	private Endereco endereco;
	
	@Column(name="ds_email", length=150)
	private String email;
	
	@OneToMany(cascade=CascadeType.ALL)
	private List<Telefone> listaTelefones;
	
	public Empresa() {

	}

	public Empresa(String razaoSocial, String nomeFantasia, String cnpj, Endereco endereco, String email,
			List<Telefone> listaTelefones) {
		this.razaoSocial = razaoSocial;
		this.nomeFantasia = nomeFantasia;
		this.cnpj = cnpj;
		this.endereco = endereco;
		this.email = email;
		this.listaTelefones = listaTelefones;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Telefone> getListaTelefones() {
		return listaTelefones;
	}

	public void setListaTelefones(List<Telefone> listaTelefones) {
		this.listaTelefones = listaTelefones;
	}
	
}
