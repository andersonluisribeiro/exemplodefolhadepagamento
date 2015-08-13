import java.util.ArrayList;
import java.util.List;

public class TabelaDeInss {

	private Integer anoDeVigencia;
	private List<Aliquota> aliquotas;

	public Integer getAnoDeVigencia() {
		return anoDeVigencia;
	}

	public void setAnoDeVigencia(Integer anoDeVigencia) {
		this.anoDeVigencia = anoDeVigencia;
	}

	public List<Aliquota> getAliquotas() {
		Aliquota primeira = new Aliquota(0.0, 1399.12, 0.08, null);
		Aliquota segunda = new Aliquota(1399.13, 2331.88, 0.09, null);
		Aliquota terceira = new Aliquota(2331.89, 4663.75, 0.11, null);
		Aliquota quarta = new Aliquota(4663.76, null, null, 513.02);
		
		List<Aliquota> aliquotasFail = new ArrayList<>();
		aliquotasFail.add(primeira);
		aliquotasFail.add(segunda);
		aliquotasFail.add(terceira);
		aliquotasFail.add(quarta);
		
		return aliquotasFail;
	}

	public void setAliquotas(List<Aliquota> aliquotas) {
		this.aliquotas = aliquotas;
	}
	
	
}
