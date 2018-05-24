package br.com.sinapsisenergia.helpdesk.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="T_PS_TELEFONE")
public class Telefone {

	@Id
	@Column(name="id_telefone")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="nr_ddd", nullable=false)
	private int ddd;
	
	@Column(name="nr_telefone", nullable=false)
	private int numero;
	
	@Column(name="tp_telefone", nullable=false)
	@Enumerated(EnumType.STRING)
	private TipoTelefone tipo;
	
	@Column(name="tx_ramal", length=10)
	private String ramal;

	public Telefone() {

	}
	
	public Telefone(int ddd, int numero, TipoTelefone tipo, String ramal) {
		this.ddd = ddd;
		this.numero = numero;
		this.tipo = tipo;
		this.ramal = ramal;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDdd() {
		return ddd;
	}

	public void setDdd(int ddd) {
		this.ddd = ddd;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public TipoTelefone getTipo() {
		return tipo;
	}

	public void setTipo(TipoTelefone tipo) {
		this.tipo = tipo;
	}

	public String getRamal() {
		return ramal;
	}

	public void setRamal(String ramal) {
		this.ramal = ramal;
	}
	
}
