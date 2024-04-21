package clases;

import java.time.LocalDate;

public class UsoTopico extends Producto {
	
	protected String PAO;
	protected String consistencia;
	protected String zonaAplicacion;
	
	public UsoTopico(int id, String nombre, double precio, int cantidad, String unidades, LocalDate caducidad, String pAO,
			String consistencia, String zonaAplicacion) {
		super(id, nombre, precio, cantidad, unidades, caducidad);
		PAO = pAO;
		this.consistencia = consistencia;
		this.zonaAplicacion = zonaAplicacion;
	}

	public String getPAO() {
		return PAO;
	}

	public void setPAO(String pAO) {
		PAO = pAO;
	}

	public String getConsistencia() {
		return consistencia;
	}

	public void setConsistencia(String consistencia) {
		this.consistencia = consistencia;
	}

	public String getzonaAplicacion() {
		return zonaAplicacion;
	}

	public void setInstruccionesAplicacion(String zonaAplicacion) {
		this.zonaAplicacion = zonaAplicacion;
	}
	
	
	
}
