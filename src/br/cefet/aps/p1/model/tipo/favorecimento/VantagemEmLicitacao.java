package br.cefet.aps.p1.model.tipo.favorecimento;

import br.cefet.aps.p1.model.TipoFavorecimento;

public class VantagemEmLicitacao extends TipoFavorecimento {

	@Override
	public String tipo() {
		return "Vantagem em licita��o";
	}

	@Override
	public double calculaMontante() {
		return 900;
	}

}
