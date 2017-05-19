package br.cefet.aps.p1.control;

import java.util.HashMap;
import java.util.Map;

import br.cefet.aps.p1.model.Favorecido;
import br.cefet.aps.p1.model.Favorecimento;
import br.cefet.aps.p1.model.Propina;
import br.cefet.aps.p1.model.PropinaState;
import br.cefet.aps.p1.model.TipoFavorecido;
import br.cefet.aps.p1.model.TipoFavorecimento;

class PropinaFactory {
	
	private static Map<Integer, TipoFavorecidoServices> tiposFavorecido  = new HashMap<Integer, TipoFavorecidoServices>();
	private static Map<Integer, TipoFavorecimentoServices> tiposFavorecimento = new HashMap<Integer, TipoFavorecimentoServices>();
	private static Map<Integer, PropinaStateServices> estadoPropina = new HashMap<Integer, PropinaStateServices>();
	
	static{
		tiposFavorecido.put(0, new PessoaPublicaServices());
		tiposFavorecido.put(1, new PessoaPrivadaServices());

		tiposFavorecimento.put(0, new FavorPoliticoServices());
		tiposFavorecimento.put(1, new VantagemEmLicitacaoServices());
		tiposFavorecimento.put(2, new InformacaoPrivilegiadaServices());
		tiposFavorecimento.put(3, new DoacaoDeCampanhaServices());

		estadoPropina.put(0, new PropinaStatePagaServices());
		estadoPropina.put(1, new PropinaStateCanceladaServices());
		
	}
	
	public static Propina createPropina(Long id, String data, int tipoFavorecido,
			String apelido, int tipoFavorecimento, String descricao, int estado){
		TipoFavorecido tipoFavorecidoObj = tiposFavorecido.get(tipoFavorecido).newTipoFavorecido();
		TipoFavorecimento tipoFavorecimentoObj = tiposFavorecimento.get(tipoFavorecimento).newTipoFavorecimento();
		
		Favorecido favorecido = new Favorecido();
		favorecido.setApelido(apelido);
		favorecido.setTipoFavorecido(tipoFavorecidoObj);
		Favorecimento favorecimento = new Favorecimento();
		favorecimento.setDescricao(descricao);
		favorecimento.setTipoFavorecimento(tipoFavorecimentoObj);
		
		Propina p = new Propina(id, data, favorecido, favorecimento);
		PropinaState state = estadoPropina.get(estado).newPropinaState(p);
		p.setState(state);
		return p;
	}
}
