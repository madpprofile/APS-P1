package br.cefet.aps.p1.model.tipo.favorecimento;

import br.cefet.aps.p1.model.TipoFavorecimento;

public class FavorPolitico extends TipoFavorecimento {

	@Override
	public String tipo() {
		return "Favor Político";
	}

	@Override
	public double calculaMontante() {
		return 1000;
	}

}
