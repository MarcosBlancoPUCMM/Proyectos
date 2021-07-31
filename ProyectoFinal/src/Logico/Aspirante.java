package Logico;

import java.util.ArrayList;

public class Aspirante {

	protected ArrayList<SolicitudLaboral> solicitud;
	protected String nombre, apellidos, ciudad, cedula, telefono, direccion, nacionalidad, pais, correo, sexo, estadoCivil;
	protected boolean estado; //Empleado o sin trabajo
	protected int edad;
	
	public Aspirante(ArrayList<SolicitudLaboral> solicitud, String nombre, String apellidos, String ciudad,
			String cedula, String telefono, String direccion, String nacionalidad, String pais, String correo,
			String sexo, String estadoCivil, boolean estado, int edad) {
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
		this.estado = estado;
		this.edad = edad;
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
	
	public boolean registrarSolicitud(SolicitudLaboral solicitu) {
		boolean logrado = false;
		if (solicitu != null) {
			solicitud.add(solicitu);
			logrado = true;
		}
		return logrado;
	}
	
}
