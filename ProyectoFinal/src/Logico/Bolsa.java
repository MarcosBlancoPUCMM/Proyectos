package Logico;

import java.util.ArrayList;

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

	public boolean registrarOferta(OfertaLaboral oferta) {
		boolean logrado = false;
		if (oferta != null) {
			ofertas.add(oferta);
			logrado = true;
		}
		return logrado;
	}
	
	public boolean existeAspirante(Aspirante aspirante) {
		int i = 0;
		boolean existe = false;
		while (i < aspirantes.size() && !existe) {
			if (aspirantes.get(i).getCedula().equalsIgnoreCase(aspirante.getCedula())) { //Si coinciden las cedulas se considera 
				existe = true;                                                           //que el aspirante existe
			}
			i++;
		}
		return existe;
	}
	
	public boolean registrarAspirante(Aspirante aspirante) {
		boolean logrado = false;
		if (aspirante != null && !existeAspirante(aspirante)) {		//Si el metodo encuentra al aspirante lo registra
			aspirantes.add(aspirante);
			logrado = true;
		}
		return logrado;
	}
	
	public boolean registrarSolicitud(SolicitudLaboral solicitud) {
		boolean logrado = false;
		if (solicitud != null) {
			solicitudes.add(solicitud);
			logrado = true;
		}
		return logrado;
	}

	public Empresa buscarEmpresa(String RNC) {
		int i = 0;
		boolean encontrado = false;
		Empresa aux = null;
		while (i < empresas.size() && !encontrado) {
			if (empresas.get(i).getRNC().equalsIgnoreCase(RNC)) {
				aux = empresas.get(i);
				encontrado = true;
			}
			i++;
		}
		return aux;
	}
	
	public boolean registrarEmpreza(Empresa empresa) {
		boolean logrado = false;
		Empresa aux = buscarEmpresa(empresa.getRNC());
		if (aux == null) {
			empresas.add(empresa);
			logrado = true;
		}
		return logrado;
	}
	
	public Aspirante findAspiranteByCedula(String cedula) {
		for (Aspirante aspirante : aspirantes) {
			if (aspirante.getCedula().equalsIgnoreCase(cedula)) {
				return aspirante;
			}
		}
		return null;
	}

	public void generarReporte() {
		
	}
}
