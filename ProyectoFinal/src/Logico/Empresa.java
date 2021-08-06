package Logico;

import java.util.ArrayList;

public class Empresa {

	private String nombre, telefono, direccion, RNC;
	private ArrayList<OfertaLaboral> ofertas;
	
	public Empresa(String nombre, String telefono, String direccion, String rNC, ArrayList<OfertaLaboral> ofertas) {
		super();
		this.nombre = nombre;
		this.telefono = telefono;
		this.direccion = direccion;
		RNC = rNC;
		this.ofertas = ofertas;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getRNC() {
		return RNC;
	}
	
	public void setRNC(String rNC) {
		RNC = rNC;
	}
	
	public ArrayList<OfertaLaboral> getOfertas() {
		return ofertas;
	}
	public void setOfertas(ArrayList<OfertaLaboral> ofertas) {
		this.ofertas = ofertas;
	}
	
	public void insertarOferta(OfertaLaboral oferta) {
		ofertas.add(oferta);
	}
	
	 public OfertaLaboral buscarOferta(String id) {
		int i = 0;
		boolean encontrado = false;
		OfertaLaboral aux = null;
		while (i < ofertas.size() && !encontrado) {
			if (ofertas.get(i).getId().equalsIgnoreCase(id)) {
				aux = ofertas.get(i);
				encontrado = true;
			}
			i++;
		}
		return aux;
	}

	public int buscarIndexSolicitudEmpresa(String id) {
		int i = 0;
		boolean encontrado = false;
		int aux = 0;
		while (i < ofertas.size() && !encontrado) {
			if (ofertas.get(i).getId().equalsIgnoreCase(id)) {
				aux = i;
				encontrado = true;
			}
			i++;
		}
		return aux;
	}
	
	public void borrarOferta(int i) {
		ofertas.remove(i);
	}
}
