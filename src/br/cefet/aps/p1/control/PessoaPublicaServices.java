package br.cefet.aps.p1.control;

import br.cefet.aps.p1.model.TipoFavorecido;
import br.cefet.aps.p1.model.tipo.favorecido.PessoaPublica;

class PessoaPublicaServices implements TipoFavorecidoServices{
	@Override
	public TipoFavorecido newTipoFavorecido(){
		return new PessoaPublica();
	}

}
