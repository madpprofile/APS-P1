package br.cefet.aps.p1.model.tipo.favorecimento;

import br.cefet.aps.p1.model.TipoFavorecimento;

public class DoacaoDeCampanha extends TipoFavorecimento {

	@Override
	public String tipo() {
		return "Doação de campanha";
	}

	@Override
	public double calculaMontante() {
		return 700;
	}

}
