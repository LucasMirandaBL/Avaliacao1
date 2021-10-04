package gerenciador_cervejas.servico;

import gerenciador_cervejas.entidade.Cerveja;

public class Venda {
	
	private Pedido pedido;
	
	public String exibirNota(double pagamento) {
		String nota = "----Julio Ceverjeiro----\n";
		for (Cerveja cerva: pedido.getCervas()) {
			nota += cerva.getNome() +  "-" + cerva.getCodigo() + "----------" + cerva.getPreço() + "\n";
		}
		
		nota += "Valor total: " + pedido.valorTotal() + " - Troco: " + getTroco(pagamento);
		return nota;
	}
	
	private double getTroco(double valorPago) {
		return valorPago - pedido.valorTotal();
	}
	
}
