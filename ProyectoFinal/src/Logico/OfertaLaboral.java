package Logico;

public class OfertaLaboral {

<<<<<<< HEAD
	private String nombre, tipo, carrera, area, nacionalidad, ocupacion, sexo, estadoCivil;
=======
	private String nombre, carrera, area, nacionalidad, oficio1, oficio2, oficio3, oficio4, sexo, estadoCivil;
>>>>>>> branch 'master' of https://github.com/MarcosBlancoPUCMM/Proyectos.git
	private int cantAspirantes, yearsExperiencia, edad;
	private boolean completado, espanol, ingles, frances, dispuestoMudarse, licenciaConducir, trabajoParcial, microsoftOffice, adobe;
	private float paga;
	
	public OfertaLaboral(String nombre, String carrera, String area, String nacionalidad, String oficio1, String oficio2, String oficio3, String oficio4,
			String sexo, String estadoCivil, int cantAspirantes, int yearsExperiencia, int edad, boolean completado,
			boolean espanol, boolean ingles, boolean frances, boolean dispuestoMudarse, boolean licenciaConducir,
			boolean trabajoParcial, boolean microsoftOffice, boolean adobe, float paga) {
		super();
		this.nombre = nombre;
		this.carrera = carrera;
		this.area = area;
		this.nacionalidad = nacionalidad;
<<<<<<< HEAD
		this.ocupacion = ocipacion;
=======
		this.oficio1 = oficio1;
		this.oficio2 = oficio2;
		this.oficio3 = oficio3;
		this.oficio4 = oficio4;
>>>>>>> branch 'master' of https://github.com/MarcosBlancoPUCMM/Proyectos.git
		this.sexo = sexo;
		this.estadoCivil = estadoCivil;
		this.cantAspirantes = 0;
		this.yearsExperiencia = yearsExperiencia;
		this.edad = edad;
		this.completado = completado;
		this.espanol = espanol;
		this.ingles = ingles;
		this.frances = frances;
		this.dispuestoMudarse = dispuestoMudarse;
		this.licenciaConducir = licenciaConducir;
		this.trabajoParcial = trabajoParcial;
		this.microsoftOffice = microsoftOffice;
		this.adobe = adobe;
		this.paga = paga;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
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
<<<<<<< HEAD
	public String getOcupacion() {
		return ocupacion;
=======
	public String getOficio1() {
		return oficio1;
>>>>>>> branch 'master' of https://github.com/MarcosBlancoPUCMM/Proyectos.git
	}
<<<<<<< HEAD
	public void setOcupacion(String ocipacion) {
		this.ocupacion = ocipacion;
=======
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
>>>>>>> branch 'master' of https://github.com/MarcosBlancoPUCMM/Proyectos.git
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
	public int getCantAspirantes() {
		return cantAspirantes;
	}
	public void setCantAspirantes(int cantAspirantes) {
		this.cantAspirantes = cantAspirantes;
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
	public boolean isCompletado() {
		return completado;
	}
	public void setCompletado(boolean completado) {
		this.completado = completado;
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
	public float getPaga() {
		return paga;
	}
	public void setPaga(float paga) {
		this.paga = paga;
	}
}
