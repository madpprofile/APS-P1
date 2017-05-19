package br.cefet.aps.p1.model;

public class Favorecimento {
	String descricao;
	private TipoFavorecimento favorecimento;
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public TipoFavorecimento getTipoFavorecimento() {
		return favorecimento;
	}
	public void setTipoFavorecimento(TipoFavorecimento favorecimento) {
		this.favorecimento = favorecimento;
	}
	
	
}
