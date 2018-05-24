package br.com.sinapsisenergia.helpdesk.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="T_PS_ENDERECO")
@Entity
public class Endereco {

	@Id
	@Column(name="id_endereco")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="ds_logradouro", nullable=false, length=250)
	private String logradouro;
	
	@Column(name="nr_endereco", nullable=false)
	private int numero;
	
	@Column(name="ds_complemento", nullable=false, length=100)
	private String complemento;
	
	@Column(name="nm_cidade", nullable=false, length=35)
	private String cidade;
	
	@Enumerated(EnumType.STRING)
	@Column(name="nm_estado", nullable=false)
	private Estado estado;
	
	@Column(name="nr_cep", nullable=false)
	private int cep;
	
	public Endereco() {

	}

	public Endereco(String logradouro, int numero, String complemento, String cidade, Estado estado, int cep) {
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public int getCep() {
		return cep;
	}

	public void setCep(int cep) {
		this.cep = cep;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

}
