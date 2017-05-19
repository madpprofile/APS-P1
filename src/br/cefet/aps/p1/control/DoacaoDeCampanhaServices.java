package br.cefet.aps.p1.control;

import br.cefet.aps.p1.model.TipoFavorecimento;
import br.cefet.aps.p1.model.tipo.favorecimento.DoacaoDeCampanha;

class DoacaoDeCampanhaServices implements TipoFavorecimentoServices {

	@Override
	public TipoFavorecimento newTipoFavorecimento() {
		return new DoacaoDeCampanha();
	}

}
