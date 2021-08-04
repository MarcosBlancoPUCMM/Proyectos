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
	
	public boolean eliminarSolicitud(Aspirante aspirante, String id) {
		boolean logrado = false;
		int aux = 0;
		
		for(int i=0; i<=getSolicitudes().size() ; i++) {
			if(solicitudes.get(i).getId()==id) {
				solicitudes.remove(i);
				aux = aspirante.buscarIndexSolicitud(id);
				aspirante.borrarSolicitud(aux);
			}
		}
		
		return logrado;
	}
	
	public ArrayList<SolicitudLaboral> mejoresSolicitudes(ArrayList<SolicitudLaboral> solicitudes, OfertaLaboral oferta) {
		int aux = 0;
		int contador;
		int masAlto=0;
		int elementos = 0;
		
		ArrayList<SolicitudLaboral> mejoresSolicitudes = new ArrayList<>();
		
		for(int i =0; i<=solicitudes.size(); i++){
		contador = 0;
			if(oferta.getTipo()==solicitudes.get(i).getTipo() && solicitudes.get(i).isLibre()) {
				aux++;
				oferta.setCantAspirantes(aux);
				if(oferta.getEdad()==solicitudes.get(i).getEdad()) { contador++;}
				if(oferta.getEstadoCivil()==solicitudes.get(i).getEstadoCivil()) { contador++;}
				if(oferta.getNacionalidad()==solicitudes.get(i).getNacionalidad()) { contador++;}
				if(oferta.getPaga()>=(solicitudes.get(i).getPaga()-1000) && oferta.getPaga()>=(solicitudes.get(i).getPaga()+1000)) { contador++;}
				if(oferta.getSexo()==solicitudes.get(i).getSexo()) { contador++;}
				if(oferta.isAdobe()==solicitudes.get(i).isAdobe()) { contador++;}
				if(oferta.isDispuestoMudarse()==solicitudes.get(i).isDispuestoMudarse()) { contador++;}
				if(oferta.isEspanol()==solicitudes.get(i).isEspanol()) { contador++;}
				if(oferta.isFrances()==solicitudes.get(i).isFrances()) { contador++;}
				if(oferta.isIngles()==solicitudes.get(i).isIngles()) { contador++;}
				if(oferta.isLicenciaConducir()==solicitudes.get(i).isLicenciaConducir()) { contador++;}
				if(oferta.isMicrosoftOffice()==solicitudes.get(i).isMicrosoftOffice()) { contador++;}
				if(oferta.isTrabajoParcial()==solicitudes.get(i).isTrabajoParcial()) { contador++;}
				
				//Tecnico
				if(oferta.getTipo()=="Tecnico") {
				if(oferta.getYearsExperiencia()<=solicitudes.get(i).getYearsExperiencia()) { contador++;}
				if(oferta.getArea()==solicitudes.get(i).getArea()) { contador++;}
				}
				
				//Obrero
				if(oferta.getTipo()=="Obrero") {
				if(oferta.getOficio1()==solicitudes.get(i).getOficio1()) { contador++;}
				if(oferta.getOficio2()==solicitudes.get(i).getOficio2()) { contador++;}
				if(oferta.getOficio3()==solicitudes.get(i).getOficio3()) { contador++;}
				if(oferta.getOficio4()==solicitudes.get(i).getOficio4()) { contador++;}
				}
				
				//Universitario
				if(oferta.getTipo()=="Universitario") {
				if(oferta.getCarrera()==solicitudes.get(i).getCarrera()) { contador++;}
				}
				
				if(contador>=10) {
					
					if(elementos<11) {
					elementos++;
					mejoresSolicitudes.add(solicitudes.get(i));}
					else {
						if(contador>masAlto) {
							mejoresSolicitudes.add(0, solicitudes.get(i));
							masAlto=contador;
						}
					}		}
				}
			}
			
		//oferta.setCompletado(true);   Cuando el aspirante es contratado
	//	solicitudes.get(ganador).setLibre(false);
		
		return mejoresSolicitudes;
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
