package Logico;

import java.util.ArrayList;

import logico.Persona;

public class Bolsa {

	private static Bolsa bolsa = null;
	private ArrayList<Aspirante> aspirantes;
	private ArrayList<Empresa> empresas;
	private ArrayList<OfertaLaboral> ofertas;
	private ArrayList<SolicitudLaboral> solicitudes;
	
	public Bolsa() {
		super();
		aspirantes = new ArrayList<>();
		empresas = new ArrayList<>();
		ofertas = new ArrayList<>();
		solicitudes = new ArrayList<>();
	}
	
	public static Bolsa getInstance() {
		if (bolsa == null) {
			bolsa = new Bolsa();
		}
		return bolsa;
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

	public OfertaLaboral registrarOferta(OfertaLaboral oferta) {
		
		return;
	}
	
	public boolean existeAspirante(Aspirante aspirante) {
		int i = 0;
		boolean existe = false;
		while (i < aspirantes.size() && !existe) {
			if (aspirantes.get(i).getCedula().equalsIgnoreCase(aspirante.getCedula())) {
				existe = true;
			}
			i++;
		}
		return existe;
	}
	
	public boolean registrarAspirante(Aspirante aspirante) {
		boolean logrado = false;
		if (aspirante != null && !existeAspirante(aspirante)) {
			aspirantes.add(aspirante);
			logrado = true;
		}
		return logrado;
	}
	
	public void generarReporte() {
		
	}
	*/
}
