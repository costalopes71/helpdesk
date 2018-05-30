package br.com.sinapsisenergia.helpdesk.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ESTADO")
public class Estado {

	@Id
	@Column(name="id_estado")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String sigla;
	
	public Estado() {

	}
	
	public Estado(String sigla) {
		this.sigla = sigla;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	
}
