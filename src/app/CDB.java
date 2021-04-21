package app;

public class CDB {

	private final int QTDE_DIAS_ANO = 365;
	private float valorInicial;
	private float taxaJuros;
	private int qtdeDias;
	
	public CDB(float valorInicial, float taxaJuros, int qtdeDias) {
		this.setValorInicial(valorInicial);
		this.setTaxaJuros(taxaJuros);
		this.setQtdeDias(qtdeDias);
	}
	
	public float getImpostoDeRenda() {
		return 3.14f;
	}
	public float getRendimentoBruto() {
		return getValorInicial() * getTaxaJuros() * getQtdeDias() / (float) QTDE_DIAS_ANO;
	}
	
	public float getValorInicial() {
		return valorInicial;
	}
	public void setValorInicial(float valorInicial) {
		this.valorInicial = valorInicial;
	}
	public float getTaxaJuros() {
		return taxaJuros;
	}
	public void setTaxaJuros(float taxaJuros) {
		this.taxaJuros = taxaJuros;
	}
	public int getQtdeDias() {
		return qtdeDias;
	}
	public void setQtdeDias(int qtdeDias) {
		this.qtdeDias = qtdeDias;
	}
}
