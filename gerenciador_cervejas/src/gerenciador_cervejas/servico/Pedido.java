package gerenciador_cervejas.servico;

import java.util.List;

import gerenciador_cervejas.entidade.Cerveja;

public class Pedido {

	private List<Cerveja> cervas;
	
	public List<Cerveja> getCervas() {
		return cervas;
	}

	public void adicionaCerveja(Cerveja c) {
		cervas.add(c);
	}
	
	public void removeCerveja(String codigo) {
		for (Cerveja cerva : cervas) {
			if (cerva.getCodigo().equalsIgnoreCase(codigo)) {
				cervas.remove(cerva);
			}
		}
	}
	
	public int totalCervejas() {
		return cervas.size();
	}
	
	public double valorTotal() {
		double total = 0.0;
		
		for (Cerveja cerva : cervas) {
			total += cerva.getPreço();
		}
		
		return total;
	}
}
