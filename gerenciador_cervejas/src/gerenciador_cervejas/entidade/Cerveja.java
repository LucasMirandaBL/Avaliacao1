package gerenciador_cervejas.entidade;

import java.util.Date;

public class Cerveja {
	
	private String codigo;
	private String nome;
	private Date dataProducao;
	private Date dataValidade;
	private double pre�o;
	
	public Cerveja(String codigo, String nome, Date dataProducao, Date dataValidade, double pre�o) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.dataProducao = dataProducao;
		this.dataValidade = dataValidade;
		this.pre�o = pre�o;
	}
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataProducao() {
		return dataProducao;
	}
	public void setDataProducao(Date dataProducao) {
		this.dataProducao = dataProducao;
	}
	public Date getDataValidade() {
		return dataValidade;
	}
	public void setDataValidade(Date dataValidade) {
		this.dataValidade = dataValidade;
	}
	public double getPre�o() {
		return pre�o;
	}
	public void setPre�o(double pre�o) {
		this.pre�o = pre�o;
	}	

}
