package br.cefet.aps.p1.model;

public class Propina {
	private Long id;
	private String data;
	private Favorecido favorecido;
	private Favorecimento favorecimento;
	private PropinaState state;
	
	//constructor
	public Propina(Long id, String data, Favorecido favorecido, Favorecimento favorecimento){
		this.id = id;
		this.data = data;
		this.favorecido = favorecido;
		this.favorecimento = favorecimento;
		
	}
	
	//getters and setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Favorecido getFavorecido() {
		return favorecido;
	}

	public void setFavorecido(Favorecido favorecido) {
		this.favorecido = favorecido;
	}

	public Favorecimento getFavorecimento() {
		return favorecimento;
	}

	public void setFavorecimento(Favorecimento favorecimento) {
		this.favorecimento = favorecimento;
	}

	public PropinaState getState() {
		return state;
	}

	public void setState(PropinaState state) {
		this.state = state;
	}
	
	//methods
	public double calculaPagamentoTemplate(){
		return state.calculaPagamentoTemplate();
	}
}
