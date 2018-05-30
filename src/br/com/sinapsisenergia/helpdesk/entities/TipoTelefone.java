package br.com.sinapsisenergia.helpdesk.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TIPO_TELEFONE")
public class TipoTelefone {

	@Id
	@Column(name="id_tipo_telefone")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String tipo;
	
	public TipoTelefone() {

	}

	public TipoTelefone(String tipo) {
		this.tipo = tipo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}
