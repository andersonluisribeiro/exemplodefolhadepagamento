import java.util.ArrayList;
import java.util.List;

public class TabelaDeIRRF {

	private Integer anoDeVigencia;
	private Double valorPorDependente;
	private List<AliquotaDeIRRF> aliquotas;
	
	public Integer getAnoDeVigencia() {
		return anoDeVigencia;
	}
	public void setAnoDeVigencia(Integer anoDeVigencia) {
		this.anoDeVigencia = anoDeVigencia;
	}
	public Double getValorPorDependente() {
		return valorPorDependente;
	}
	public void setValorPorDependente(Double valorPorDependente) {
		this.valorPorDependente = valorPorDependente;
	}
	public List<AliquotaDeIRRF> getAliquotas() {
		aliquotas = new ArrayList<>();
		aliquotas.add(new AliquotaDeIRRF(0.0, 1903.98, 0.0, 0.0));
		aliquotas.add(new AliquotaDeIRRF(1903.99, 2826.65, 0.075, 142.80));
		aliquotas.add(new AliquotaDeIRRF(2826.66, 3751.05, 0.15, 354.80));
		aliquotas.add(new AliquotaDeIRRF(3751.06, 4664.68, 0.225, 636.13));
		aliquotas.add(new AliquotaDeIRRF(4664.69, null, 0.275, 869.36));
		return aliquotas;
	}
	public void setAliquotas(List<AliquotaDeIRRF> aliquotas) {
		this.aliquotas = aliquotas;
	}	 
	
}
