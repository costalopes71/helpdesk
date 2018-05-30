package br.com.sinapsisenergia.helpdesk.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="TELEFONE")
public class Telefone {

	@Id
	@Column(name="id_telefone")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@ManyToOne
	@JoinColumn(name="id_usuario")
	private Usuario usuario;
	
	private int ddd;
	
	@Column(name="telefone")
	private int numeroTelefone;
	
	@ManyToOne
	@JoinColumn(name="id_tipo_telefone")
	private TipoTelefone tipo;
	
	private String ramal;

	public Telefone() {

	}

	public Telefone(Usuario usuario, int ddd, int numeroTelefone, TipoTelefone tipo, String ramal) {
		this.usuario = usuario;
		this.ddd = ddd;
		this.numeroTelefone = numeroTelefone;
		this.tipo = tipo;
		this.ramal = ramal;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public int getDdd() {
		return ddd;
	}

	public void setDdd(int ddd) {
		this.ddd = ddd;
	}

	public int getNumeroTelefone() {
		return numeroTelefone;
	}

	public void setNumeroTelefone(int numeroTelefone) {
		this.numeroTelefone = numeroTelefone;
	}

	public String getRamal() {
		return ramal;
	}

	public void setRamal(String ramal) {
		this.ramal = ramal;
	}

	public TipoTelefone getTipo() {
		return tipo;
	}

	public void setTipo(TipoTelefone tipo) {
		this.tipo = tipo;
	}
	
}
