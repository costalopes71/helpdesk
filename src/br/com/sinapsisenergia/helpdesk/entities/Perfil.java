package br.com.sinapsisenergia.helpdesk.entities;

public enum Perfil {

	USUARIO("Usuário"), FUNCIONARIO("Funcionario"), GERENTE("Gerente");
	
	private String perfil;
	
	private Perfil(String perfil) {
		this.perfil = perfil;
	}

	public String getPerfil() {
		return perfil;
	}

}
