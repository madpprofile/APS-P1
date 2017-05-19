package br.cefet.aps.p1.model.tipo.favorecido;

import br.cefet.aps.p1.model.TipoFavorecido;

public class PessoaPublica extends TipoFavorecido {

	@Override
	public String tipo() {
		return "Pessoa P�blica";
	}

	@Override
	public double calculaTaxa() {
		return 1.1;
	}

}
