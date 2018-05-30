package br.com.sinapsisenergia.helpdesk.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="DOWNLOAD")
public class Download {

	@Id
	@Column(name="id_download")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@OneToOne
	@JoinColumn(name="id_empresa_produto")
	private EmpresaProduto idEmpresaProduto;
	
	private String arquivo;
	
	private String versao;
	
	private String descricao;
	
	public Download() {

	}

	public Download(EmpresaProduto idEmpresaProduto, String arquivo, String versao, String descricao) {
		this.idEmpresaProduto = idEmpresaProduto;
		this.arquivo = arquivo;
		this.versao = versao;
		this.descricao = descricao;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public EmpresaProduto getIdEmpresaProduto() {
		return idEmpresaProduto;
	}

	public void setIdEmpresaProduto(EmpresaProduto idEmpresaProduto) {
		this.idEmpresaProduto = idEmpresaProduto;
	}

	public String getArquivo() {
		return arquivo;
	}

	public void setArquivo(String arquivo) {
		this.arquivo = arquivo;
	}

	public String getVersao() {
		return versao;
	}

	public void setVersao(String versao) {
		this.versao = versao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
