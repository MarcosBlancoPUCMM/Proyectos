package Logico;

import java.util.ArrayList;

public class Obrero extends Aspirante {

	private String oficio1;
	private String oficio2;
	private String oficio3;
	private String oficio4;
	
	public Obrero(ArrayList<SolicitudLaboral> solicitud, String nombre, String apellidos, String ciudad, String cedula,
			String telefono, String direccion, String nacionalidad, String pais, String correo, String sexo,
			String estadoCivil, boolean estado, int edad, String oficio1, String oficio2, String oficio3,
			String oficio4) {
		super(solicitud, nombre, apellidos, ciudad, cedula, telefono, direccion, nacionalidad, pais, correo, sexo, estadoCivil,
				estado, edad);
		
		this.oficio1 = oficio1;
		this.oficio2 = oficio2;
		this.oficio3 = oficio3;
		this.oficio4 = oficio4;
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

}
