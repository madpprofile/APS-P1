package br.cefet.aps.p1.model.tipo.favorecido;

import br.cefet.aps.p1.model.TipoFavorecido;

public class PessoaPrivada extends TipoFavorecido{

	@Override
	public String tipo() {
		return "Pessoa Privada";
	}

	@Override
	public double calculaTaxa() {
		return 1.2;
	}

}
