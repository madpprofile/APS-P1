package br.cefet.aps.p1.control;

import br.cefet.aps.p1.model.Propina;
import br.cefet.aps.p1.model.PropinaState;
import br.cefet.aps.p1.model.PropinaStatePaga;

class PropinaStatePagaServices implements PropinaStateServices {

	@Override
	public PropinaState newPropinaState(Propina p) {
		return new PropinaStatePaga(p);
	}

}
