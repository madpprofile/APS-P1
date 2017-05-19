package br.cefet.aps.p1.model;

public class PropinaStatePaga extends PropinaState {
	
	public PropinaStatePaga(Propina propina) {
		super(propina);
	}
	
	@Override
	public double calculaPagamentoTemplate(){
		return getPropina().getFavorecido().getTipoFavorecido().calculaTaxa() * 
				getPropina().getFavorecimento().getTipoFavorecimento().calculaMontante();
		
	}

	@Override
	public String estado() {
		return "Paga";
	}
}
