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
	
	
}
