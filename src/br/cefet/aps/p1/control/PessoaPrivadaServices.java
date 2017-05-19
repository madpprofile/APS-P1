package br.cefet.aps.p1.control;

import br.cefet.aps.p1.model.TipoFavorecido;
import br.cefet.aps.p1.model.tipo.favorecido.PessoaPrivada;

class PessoaPrivadaServices implements TipoFavorecidoServices {
	@Override
	public TipoFavorecido newTipoFavorecido(){
		return new PessoaPrivada();
	}

}
