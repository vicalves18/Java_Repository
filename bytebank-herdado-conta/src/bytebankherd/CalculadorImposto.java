package bytebankherd;

public class CalculadorImposto {
	private double totalImposto;
	
	public void registra(Tributavel t) {
		double valor = t.getValImposto();
		this.totalImposto += valor;
	}
	
	public double getTotalImposto() {
		return totalImposto;
	}
}
