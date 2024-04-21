package clases;

import java.time.LocalDate;

public class UsoOral extends Producto {
	protected boolean enAyunas;
	protected int dosisMax;
	
	public UsoOral(int id, String nombre, double precio, int cantidad, String unidades, LocalDate caducidad,
			boolean enAyunas, int dosisMax) {
		super(id, nombre, precio, cantidad, unidades, caducidad);
		this.enAyunas = enAyunas;
		this.dosisMax = dosisMax;
	}

	public boolean isEnAyunas() {
		return enAyunas;
	}

	public void setEnAyunas(boolean enAyunas) {
		this.enAyunas = enAyunas;
	}

	public int getDosisMax() {
		return dosisMax;
	}

	public void setDosisMax(int dosisMax) {
		this.dosisMax = dosisMax;
	}
	
	
	
}
