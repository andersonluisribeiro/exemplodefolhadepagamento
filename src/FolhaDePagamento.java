
public class FolhaDePagamento {
	
	private Integer mes;
	private Integer ano;
	private Empregado empregado;
	private TabelaDeInss tabelaDeInss;
	
	public Integer getMes() {
		return mes;
	}
	public void setMes(Integer mes) {
		this.mes = mes;
	}
	public Integer getAno() {
		return ano;
	}
	public void setAno(Integer ano) {
		this.ano = ano;
	}
	public Empregado getEmpregado() {
		return empregado;
	}
	public void setEmpregado(Empregado empregado) {
		this.empregado = empregado;
	}
	
	public TabelaDeInss getTabelaDeInss() {
		return tabelaDeInss;
	}
	public void setTabelaDeInss(TabelaDeInss tabelaDeInss) {
		this.tabelaDeInss = tabelaDeInss;
	}
	public Double salarioBase(){
		return getEmpregado().getCargo().getSalarioBase();
	}
	
	public Double salarioBruto(){
		return salarioBase();
	}
	
	public Double inss(){		
		for(Aliquota aliquota : tabelaDeInss.getAliquotas()){
			
		}
		
		return salarioBruto() * 0.08;
	}
	
	

}