package br.cefet.aps.p1.model;

public class InformacaoPrivilegiada extends TipoFavorecimento {

	@Override
	public String tipo() {
		return "Informa��o privilegiada";
	}

	@Override
	public double calculaMontante() {
		return 800;
	}

}
