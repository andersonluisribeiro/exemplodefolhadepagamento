
public class Aliquota {

	private Double salarioInicial;
	private Double salarioFinal;
	private Double valor;
	private Double valorFixo;
	
	
	public Aliquota(Double salarioInicial, Double salarioFinal, Double valor, Double valorFixo) {
		this.salarioInicial = salarioInicial;
		this.salarioFinal = salarioFinal;
		this.valor = valor;
		this.valorFixo = valorFixo;
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
	public Double getValorFixo() {
		return valorFixo;
	}
	public void setValorFixo(Double valorFixo) {
		this.valorFixo = valorFixo;
	}
	
	
	
}
