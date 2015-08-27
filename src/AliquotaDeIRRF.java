
public class AliquotaDeIRRF {

	private Double salarioInicial;
	private Double salarioFinal;
	private Double valor;
	private Double parcelaADeduzir;
	
	public AliquotaDeIRRF(Double salarioInicial, Double salarioFinal, Double valor, Double parcelaADeduzir) {
		this.salarioInicial = salarioInicial;
		this.salarioFinal = salarioFinal;
		this.valor = valor;
		this.parcelaADeduzir = parcelaADeduzir;
	}
	
	public Double getSalarioInicial() {
		return salarioInicial;
	}
	public void setSalarioInicial(Double salarioInicial) {
		this.salarioInicial = salarioInicial;
	}
	public Double getSalarioFinal() {
		return salarioFinal;
	}
	public void setSalarioFinal(Double salarioFinal) {
		this.salarioFinal = salarioFinal;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public Double getParcelaADeduzir() {
		return parcelaADeduzir;
	}
	public void setParcelaADeduzir(Double parcelaADeduzir) {
		this.parcelaADeduzir = parcelaADeduzir;
	}
	
	
	
}
