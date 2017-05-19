package br.cefet.aps.p1.control;

import br.cefet.aps.p1.model.InformacaoPrivilegiada;
import br.cefet.aps.p1.model.TipoFavorecimento;

class InformacaoPrivilegiadaServices implements TipoFavorecimentoServices {

	@Override
	public TipoFavorecimento newTipoFavorecimento() {
		return new InformacaoPrivilegiada();
	}

}
