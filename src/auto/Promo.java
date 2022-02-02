package auto;

import java.util.Arrays;

public class Promo {
	String nombre;
	Auto[] autos;
	private int porcentajeDescuento;

	public Promo(String nombre, int porcentajeDescuento, Auto[] autos) {
		this.nombre = nombre;
		this.porcentajeDescuento = porcentajeDescuento;
		this.autos = autos;
	}

	@Override
	public String toString() {
		return "Promo [nombre=" + nombre + ", autos=\n" + Arrays.toString(autos) + ", precioConDesc=" + getPrecio() + "]\n";
	}

	// En teoria si quisiera aplicar algun descuento
	public int getPrecio() {
		int precioTotal = 0;
		for (Auto auto : autos) {
			precioTotal += auto.getCosto();
		}

		return (int) Math.floor(precioTotal * (1 - /* descuento */ porcentajeDescuento / 100.0));
	}
}
