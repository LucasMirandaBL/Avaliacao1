package gerenciador_cervejas.entidade;

import java.util.Date;

public class Trigo extends Cerveja {

	public Trigo(String codigo, String nome, Date dataProducao, Date dataValidade, double preço) {
		super(codigo, nome, dataProducao, dataValidade, preço);
	}
	
}
