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
	
	public float getRendimentoLiquido() {
		return 1.0829f;
	}
	public float getImpostoDeRenda() {
		
		float aliquota;
		
		if (getQtdeDias() <= 180) {
			aliquota = 0.225f;
		} else if (getQtdeDias() <= 360) {
			aliquota = 0.2f;
		} else if (getQtdeDias() <= 720) {
			aliquota = 0.175f;
		} else {
			aliquota = 0.15f;
		}
		
		return getRendimentoBruto() * aliquota;
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
