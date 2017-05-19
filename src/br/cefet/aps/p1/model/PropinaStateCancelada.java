package br.cefet.aps.p1.model;

public class PropinaStateCancelada extends PropinaState {
	
	public PropinaStateCancelada(Propina propina) {
		super(propina);
	}

	@Override
	public double calculaPagamentoTemplate() {
		return 0.0;
	}

	@Override
	public String estado() {
		return "Cancelada";
	}

}
