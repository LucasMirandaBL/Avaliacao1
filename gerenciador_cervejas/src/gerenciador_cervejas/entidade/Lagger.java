package gerenciador_cervejas.entidade;

import java.util.Date;

public class Lagger extends Cerveja {

	public Lagger(String codigo, String nome, Date dataProducao, Date dataValidade, double preço) {
		super(codigo, nome, dataProducao, dataValidade, preço);
	}

}
