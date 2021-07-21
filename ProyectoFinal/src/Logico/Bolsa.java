package Logico;

import java.util.ArrayList;

public class Bolsa {

	private ArrayList<Aspirante> aspirantes;
	private ArrayList<Empresa> empresas;
	private ArrayList<OfertaLaboral> ofertas;
	private ArrayList<SolicitudLaboral> solicitudes;
	
	public Bolsa(ArrayList<Aspirante> aspirantes, ArrayList<Empresa> empresas, ArrayList<OfertaLaboral> ofertas,
			ArrayList<SolicitudLaboral> solicitudes) {
		super();
		this.aspirantes = aspirantes;
		this.empresas = empresas;
		this.ofertas = ofertas;
		this.solicitudes = solicitudes;
	}
	
	public ArrayList<Aspirante> getAspirantes() {
		return aspirantes;
	}

	public void setAspirantes(ArrayList<Aspirante> aspirantes) {
		this.aspirantes = aspirantes;
	}

	public ArrayList<Empresa> getEmpresas() {
		return empresas;
	}

	public void setEmpresas(ArrayList<Empresa> empresas) {
		this.empresas = empresas;
	}

	public ArrayList<OfertaLaboral> getOfertas() {
		return ofertas;
	}

	public void setOfertas(ArrayList<OfertaLaboral> ofertas) {
		this.ofertas = ofertas;
	}

	public ArrayList<SolicitudLaboral> getSolicitudes() {
		return solicitudes;
	}

	public void setSolicitudes(ArrayList<SolicitudLaboral> solicitudes) {
		this.solicitudes = solicitudes;
	}



	public OfertaLaboral registrarOferta() {
		
		return;
	}
	
	public Aspirante registrarAspirante() {
		
		return;
	}
	
	public void generarReporte() {
		
	}
	
}
