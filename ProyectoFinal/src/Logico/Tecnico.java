package Logico;

import java.util.ArrayList;

public class Tecnico extends Aspirante {

	public String area;
	public int yearsExperiencia;
	
	public Tecnico(ArrayList<SolicitudLaboral> solicitud, String nombre, String apellidos, String ciudad, String cedula,
			String telefono, String direccion, String nacionalidad, String pais, String correo, String sexo,
			String estadoCivil, boolean estado, int edad, String area, int yearsExperiencia) {
		super(solicitud, nombre, apellidos, ciudad, cedula, telefono, direccion, nacionalidad, pais, correo, sexo, estadoCivil,
				estado, edad);
		this.area = area;
		this.yearsExperiencia = yearsExperiencia;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public int getYearsExperiencia() {
		return yearsExperiencia;
	}

	public void setYearsExperiencia(int yearsExperiencia) {
		this.yearsExperiencia = yearsExperiencia;
	}
	
	
}
