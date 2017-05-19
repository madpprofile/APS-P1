package br.cefet.aps.p1.model;

public class InformacaoPrivilegiada extends TipoFavorecimento {

	@Override
	public String tipo() {
		return "Informação privilegiada";
	}

	@Override
	public double calculaMontante() {
		return 800;
	}

}
