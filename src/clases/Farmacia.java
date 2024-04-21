package clases;

import java.time.LocalDate;
import java.util.ArrayList;

import clases.Producto;

public class Farmacia {
	protected String nombre;
	protected Direccion direccionFarmacia;
	protected ArrayList<Producto> productos;
	
	public Farmacia(String nombre, Direccion direccionFarmacia) {
		this.nombre = nombre;
		this.direccionFarmacia = direccionFarmacia;
		this.productos = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Direccion getDireccionFarmacia() {
		return direccionFarmacia;
	}

	public void setDireccionFarmacia(Direccion direccionFarmacia) {
		this.direccionFarmacia = direccionFarmacia;
	}

	public ArrayList<Producto> getProductos() {
		return productos;
	}

	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}
	
	public void añadirProductos(Producto p) {
		productos.add(p);
	}
	public void mostrarProductos() {
		for (int i = 0; i < productos.size(); i++) {
			System.out.println(productos.get(i).getId() + " " + productos.get(i).getNombre() + ".	" + productos.get(i).getPrecio() + " €"); 
		}
		System.out.println("------------------------------------------------------------\n");
	}
	public void mostrarInfoProductos(int productoSeleccionado) {
		if (productos.get(productoSeleccionado - 1).getClass() == UsoOral.class) {
			System.out.println("Producto: " + productos.get(productoSeleccionado - 1).getNombre() + ".\nCaducidad: " + productos.get(productoSeleccionado - 1).getCaducidad());
			System.out.println("Dosis máxima diaria: " + ((UsoOral)productos.get(productoSeleccionado - 1)).getDosisMax() + " unidad/es. En ayunas: " +  ((UsoOral)productos.get(productoSeleccionado - 1)).isEnAyunas());
		} else {
			System.out.println("Producto: " + productos.get(productoSeleccionado - 1).getNombre() + ".\nCaducidad: " + productos.get(productoSeleccionado - 1).getCaducidad());
			System.out.println("Consistencia: " + ((UsoTopico)productos.get(productoSeleccionado - 1)).getConsistencia() + ".\nZona de aplicación: " +((UsoTopico)productos.get(productoSeleccionado - 1)).getzonaAplicacion() + 
					".\nUna vez abierto, utilizar antes de: " +  ((UsoTopico)productos.get(productoSeleccionado - 1)).getPAO() + " meses");
			
		}
			
	}
}
