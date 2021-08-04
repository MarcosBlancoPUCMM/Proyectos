package Logico;

import java.util.ArrayList;

public class Aspirante {

	protected ArrayList<SolicitudLaboral> solicitud;
	protected String nombre, apellidos, ciudad, cedula, telefono, direccion, nacionalidad, pais, correo, sexo, estadoCivil, tipo, oficio1, oficio2, oficio3, oficio4, area, carrera;
	protected boolean estado; //Empleado o sin trabajo
	protected int edad, yearsExperiencia;
	
	public Aspirante(ArrayList<SolicitudLaboral> solicitud, String nombre, String apellidos, String ciudad,
			String cedula, String telefono, String direccion, String nacionalidad, String pais, String correo,
			String sexo, String estadoCivil, String tipo, String oficio1, String oficio2, String oficio3,
			String oficio4, String area, String carrera, boolean estado, int edad, int yearsExperiencia) {
		super();
		this.solicitud = solicitud;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.ciudad = ciudad;
		this.cedula = cedula;
		this.telefono = telefono;
		this.direccion = direccion;
		this.nacionalidad = nacionalidad;
		this.pais = pais;
		this.correo = correo;
		this.sexo = sexo;
		this.estadoCivil = estadoCivil;
		this.tipo = tipo;
		this.oficio1 = oficio1;
		this.oficio2 = oficio2;
		this.oficio3 = oficio3;
		this.oficio4 = oficio4;
		this.area = area;
		this.carrera = carrera;
		this.estado = estado;
		this.edad = edad;
		this.yearsExperiencia = yearsExperiencia;
	}

	public ArrayList<SolicitudLaboral> getSolicitud() {
		return solicitud;
	}
	public void setSolicitud(ArrayList<SolicitudLaboral> solicitud) {
		this.solicitud = solicitud;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
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
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getOficio1() {
		return oficio1;
	}
	public void setOficio1(String oficio1) {
		this.oficio1 = oficio1;
	}
	public String getOficio2() {
		return oficio2;
	}
	public void setOficio2(String oficio2) {
		this.oficio2 = oficio2;
	}
	public String getOficio3() {
		return oficio3;
	}
	public void setOficio3(String oficio3) {
		this.oficio3 = oficio3;
	}
	public String getOficio4() {
		return oficio4;
	}
	public void setOficio4(String oficio4) {
		this.oficio4 = oficio4;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCarrera() {
		return carrera;
	}
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	public int getYearsExperiencia() {
		return yearsExperiencia;
	}
	public void setYearsExperiencia(int yearsExperiencia) {
		this.yearsExperiencia = yearsExperiencia;
	}
	
	public boolean registrarSolicitud(SolicitudLaboral solicitu) {
		boolean logrado = false;
		if (solicitu != null) {
			solicitud.add(solicitu);
			logrado = true;
		}
		return logrado;
	}
	
	public SolicitudLaboral buscarSolicitud(String id) {
		int i = 0;
		boolean encontrado = false;
		SolicitudLaboral aux = null;
		while (i < solicitud.size() && !encontrado) {
			if (solicitud.get(i).getId().equalsIgnoreCase(id)) {
				aux = solicitud.get(i);
				encontrado = true;
			}
			i++;
		}
		return aux;
	}
	
	public String buscarIndexSolicitud(String id) {
		int i = 0;
		boolean encontrado = false;
		String aux = null;
		while (i < solicitud.size() && !encontrado) {
			if (solicitud.get(i).getId().equalsIgnoreCase(id)) {
				aux = solicitud.get(i).getId();
				encontrado = true;
			}
			i++;
		}
		return aux;
	}
	public void addSolicitud(SolicitudLaboral solicit) {
		solicitud.add(solicit);
	}
}
