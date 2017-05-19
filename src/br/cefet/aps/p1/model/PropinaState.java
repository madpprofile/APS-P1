package br.cefet.aps.p1.model;

public abstract class PropinaState {
	
	private Propina propina;

	public PropinaState(Propina propina) {
		super();
		this.propina = propina;
	}

	public Propina getPropina() {
		return propina;
	}

	public void setPropina(Propina propina) {
		this.propina = propina;
	}

	public abstract double calculaPagamentoTemplate();
	public abstract String estado();
}
