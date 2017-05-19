package br.cefet.aps.p1.control;

import br.cefet.aps.p1.model.Propina;
import br.cefet.aps.p1.model.PropinaState;
import br.cefet.aps.p1.model.PropinaStateCancelada;

class PropinaStateCanceladaServices implements PropinaStateServices{

	@Override
	public PropinaState newPropinaState(Propina p) {
		return new PropinaStateCancelada(p);
	}

}
