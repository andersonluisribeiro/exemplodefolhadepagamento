
public class Programa {

	public static void main(String[] args) {
		
		Cargo cargo = new Cargo();
		cargo.setDescricao("Analista de Sistemas Jr.");
		cargo.setSalarioBase(7000.0);
		
		Empregado empregado = new Empregado();
		empregado.setMatricula("1222");
		empregado.setNome("Anderson Luis Ribeiro");
		empregado.setCpf("111.111.111-11");
		empregado.setCargo(cargo);
		empregado.setQuantidadeDeDependentes(2);
		
		TabelaDeInss tabelaDeInss = new TabelaDeInss();
		tabelaDeInss.setAnoDeVigencia(2015);
		
		TabelaDeIRRF tabelaDeIRRF = new TabelaDeIRRF();
		tabelaDeIRRF.setAnoDeVigencia(2015);
		tabelaDeIRRF.setValorPorDependente(189.59);
		
		FolhaDePagamento folha = new FolhaDePagamento();
		folha.setMes(8);
		folha.setAno(2015);
		folha.setEmpregado(empregado);
		folha.setTabelaDeInss(tabelaDeInss);
		folha.setTabelaDeIRRF(tabelaDeIRRF);
		folha.setAdiantamento(1000.00);
		
		System.out.println("O salário base da folha é:" + folha.salarioBase());
		System.out.println("O salário bruto da folha é: " + folha.salarioBruto());		
		System.out.println("O inss é: " + folha.inss());
		System.out.println("O adiantamento é: " + folha.getAdiantamento());		
		System.out.println("O salário líquido é: " + folha.salarioLiquido());
		System.out.println("A base de cálculo é: " + folha.baseDeCalculoDoIRRF());
		
		
	}

}
