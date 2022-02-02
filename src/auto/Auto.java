package auto;

public class Auto {
	private String marca;
	private int costo;

	public Auto(String marca, int costo) {
		this.marca = marca;
		this.costo = costo;
	}

	public String getMarca() {
		return marca;
	}

	public int getCosto() {
		return costo;
	}

	@Override
	public String toString() {
		return "Auto [marca=" + marca + ", costo=" + costo + "]\n";
	}
}
