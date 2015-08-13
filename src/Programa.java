
public class Programa {

	public static void main(String[] args) {
		
		Cargo cargo = new Cargo();
		cargo.setDescricao("Analista de Sistema Jr.");
		cargo.setSalarioBase(1000.0);
		
		Empregado empregado = new Empregado();
		empregado.setMatricula("1222");
		empregado.setNome("Anderson Luis Ribeiro");
		empregado.setCpf("111.111.111-11");
		empregado.setCargo(cargo);
		
		FolhaDePagamento folha = new FolhaDePagamento();
		folha.setMes(8);
		folha.setAno(2015);
		folha.setEmpregado(empregado);
		
		System.out.println("O sal�rio base da folha �:" + folha.salarioBase());
		System.out.println("O sal�rio bruto da folha �: " + folha.salarioBruto());
		System.out.println("O inss �: " + folha.inss());
		
	}

}