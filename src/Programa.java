
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
		
		TabelaDeInss tabelaDeInss = new TabelaDeInss();
		tabelaDeInss.setAnoDeVigencia(2015);
		
		FolhaDePagamento folha = new FolhaDePagamento();
		folha.setMes(8);
		folha.setAno(2015);
		folha.setEmpregado(empregado);
		folha.setTabelaDeInss(tabelaDeInss);
		
		System.out.println("O salário base da folha é:" + folha.salarioBase());
		System.out.println("O salário bruto da folha é: " + folha.salarioBruto());
		System.out.println("O inss é: " + folha.inss());
		
	}

}
