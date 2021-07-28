package Logico;

import java.util.ArrayList;

public class Obrero extends Aspirante {

	private String oficios;

	public Obrero(ArrayList<SolicitudLaboral> solicitud, String nombre, String apellidos, String ciudad, String cedula,
			String telefono, String direccion, String nacionalidad, String pais, String correo, String sexo,
			String estadoCivil, boolean estado, int edad, String oficio) {
		super(solicitud, nombre, apellidos, ciudad, cedula, telefono, direccion, nacionalidad, pais, correo, sexo, estadoCivil,
				estado, edad);
		oficios = oficio;
	}

	public String getOficios() {
		return oficios;
	}

	public void setOficios(String oficios) {
		this.oficios = oficios;
	}
	
	
	
}
