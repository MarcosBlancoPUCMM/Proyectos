package Logico;

public class SolicitudLaboral {

	private boolean libre, espanol, ingles, frances, dispuestoMudarse, licenciaConducir, trabajoParcial, microsoftOffice, adobe;
	private String nombre, tipo, carrera, area, nacionalidad, ocupacion, sexo, estadoCivil;
	private int yearsExperiencia, edad;
	private float paga;
	
	public SolicitudLaboral(boolean espanol, boolean ingles, boolean frances, boolean dispuestoMudarse,
			boolean licenciaConducir, boolean trabajoParcial, boolean microsoftOffice, boolean adobe, String nombre,
			String tipo, String carrera, String area, String nacionalidad, String ocipacion, String sexo,
			String estadoCivil, int yearsExperiencia, int edad, float paga) {
		super();
		this.libre = true;
		this.espanol = espanol;
		this.ingles = ingles;
		this.frances = frances;
		this.dispuestoMudarse = dispuestoMudarse;
		this.licenciaConducir = licenciaConducir;
		this.trabajoParcial = trabajoParcial;
		this.microsoftOffice = microsoftOffice;
		this.adobe = adobe;
		this.nombre = nombre;
		this.tipo = tipo;
		this.carrera = carrera;
		this.area = area;
		this.nacionalidad = nacionalidad;
		this.ocupacion = ocipacion;
		this.sexo = sexo;
		this.estadoCivil = estadoCivil;
		this.yearsExperiencia = yearsExperiencia;
		this.edad = edad;
		this.paga = paga;
	}
	
	public boolean isLibre() {
		return libre;
	}
	public void setLibre(boolean libre) {
		this.libre = libre;
	}
	public boolean isEspanol() {
		return espanol;
	}
	public void setEspanol(boolean espanol) {
		this.espanol = espanol;
	}
	public boolean isIngles() {
		return ingles;
	}
	public void setIngles(boolean ingles) {
		this.ingles = ingles;
	}
	public boolean isFrances() {
		return frances;
	}
	public void setFrances(boolean frances) {
		this.frances = frances;
	}
	public boolean isDispuestoMudarse() {
		return dispuestoMudarse;
	}
	public void setDispuestoMudarse(boolean dispuestoMudarse) {
		this.dispuestoMudarse = dispuestoMudarse;
	}
	public boolean isLicenciaConducir() {
		return licenciaConducir;
	}
	public void setLicenciaConducir(boolean licenciaConducir) {
		this.licenciaConducir = licenciaConducir;
	}
	public boolean isTrabajoParcial() {
		return trabajoParcial;
	}
	public void setTrabajoParcial(boolean trabajoParcial) {
		this.trabajoParcial = trabajoParcial;
	}
	public boolean isMicrosoftOffice() {
		return microsoftOffice;
	}
	public void setMicrosoftOffice(boolean microsoftOffice) {
		this.microsoftOffice = microsoftOffice;
	}
	public boolean isAdobe() {
		return adobe;
	}
	public void setAdobe(boolean adobe) {
		this.adobe = adobe;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getCarrera() {
		return carrera;
	}
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public String getOcupacion() {
		return ocupacion;
	}
	public void setOcupacion(String ocipacion) {
		this.ocupacion = ocipacion;
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
	public int getYearsExperiencia() {
		return yearsExperiencia;
	}
	public void setYearsExperiencia(int yearsExperiencia) {
		this.yearsExperiencia = yearsExperiencia;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public float getPaga() {
		return paga;
	}
	public void setPaga(float paga) {
		this.paga = paga;
	}
}
