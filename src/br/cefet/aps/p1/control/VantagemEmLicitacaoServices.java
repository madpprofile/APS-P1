package br.cefet.aps.p1.control;

import br.cefet.aps.p1.model.TipoFavorecimento;
import br.cefet.aps.p1.model.tipo.favorecimento.VantagemEmLicitacao;

class VantagemEmLicitacaoServices implements TipoFavorecimentoServices {

	@Override
	public TipoFavorecimento newTipoFavorecimento() {
		return new VantagemEmLicitacao();
	}

}
