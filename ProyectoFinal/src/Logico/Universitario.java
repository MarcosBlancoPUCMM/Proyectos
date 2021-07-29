package Logico;

import java.util.ArrayList;

public class Universitario extends Aspirante {

	public String carrera;

	public Universitario(ArrayList<SolicitudLaboral> solicitud, String nombre, String apellidos, String ciudad,
			String cedula, String telefono, String direccion, String nacionalidad, String pais, String correo,
			String sexo, String estadoCivil, boolean estado, int edad, String carrera) {
		super(solicitud, nombre, apellidos, ciudad, cedula, telefono, direccion, nacionalidad, pais, correo, sexo, estadoCivil,
				estado, edad);
		this.carrera = carrera;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	
	
	
}
