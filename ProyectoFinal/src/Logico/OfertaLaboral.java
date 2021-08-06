package Logico;

public class OfertaLaboral {

	private String id, nombre, carrera, area, nacionalidad, oficio1, oficio2, oficio3, oficio4;
	private int cantAspirantes, yearsExperiencia, edad;
	private boolean completado, obrero, tecnico, universitario, masculino, femenino, soltero, casado, viudo, espanol, ingles, frances, dispuestoMudarse, licenciaConducir, trabajoParcial, microsoftOffice, adobe;
	private float paga;
	public static int codOfertaLaboral = 1;
	
	public OfertaLaboral(String id, String nombre, String carrera, String area, String nacionalidad, String oficio1,
			String oficio2, String oficio3, String oficio4, int cantAspirantes, int yearsExperiencia, int edad,
			boolean completado, boolean obrero, boolean tecnico, boolean universitario, boolean masculino,
			boolean femenino, boolean soltero, boolean casado, boolean viudo, boolean espanol, boolean ingles,
			boolean frances, boolean dispuestoMudarse, boolean licenciaConducir, boolean trabajoParcial,
			boolean microsoftOffice, boolean adobe, float paga) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.carrera = carrera;
		this.area = area;
		this.nacionalidad = nacionalidad;
		this.oficio1 = oficio1;
		this.oficio2 = oficio2;
		this.oficio3 = oficio3;
		this.oficio4 = oficio4;
		this.cantAspirantes = cantAspirantes;
		this.yearsExperiencia = yearsExperiencia;
		this.edad = edad;
		this.completado = completado;
		this.obrero = obrero;
		this.tecnico = tecnico;
		this.universitario = universitario;
		this.masculino = masculino;
		this.femenino = femenino;
		this.soltero = soltero;
		this.casado = casado;
		this.viudo = viudo;
		this.espanol = espanol;
		this.ingles = ingles;
		this.frances = frances;
		this.dispuestoMudarse = dispuestoMudarse;
		this.licenciaConducir = licenciaConducir;
		this.trabajoParcial = trabajoParcial;
		this.microsoftOffice = microsoftOffice;
		this.adobe = adobe;
		this.paga = paga;
		OfertaLaboral.codOfertaLaboral++;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public boolean isObrero() {
		return obrero;
	}
	public void setObrero(boolean obrero) {
		this.obrero = obrero;
	}
	public boolean isTecnico() {
		return tecnico;
	}
	public void setTecnico(boolean tecnico) {
		this.tecnico = tecnico;
	}
	public boolean isUniversitario() {
		return universitario;
	}
	public void setUniversitario(boolean universitario) {
		this.universitario = universitario;
	}
	public boolean isMasculino() {
		return masculino;
	}
	public void setMasculino(boolean masculino) {
		this.masculino = masculino;
	}
	public boolean isFemenino() {
		return femenino;
	}
	public void setFemenino(boolean femenino) {
		this.femenino = femenino;
	}
	public boolean isSoltero() {
		return soltero;
	}
	public void setSoltero(boolean soltero) {
		this.soltero = soltero;
	}
	public boolean isCasado() {
		return casado;
	}
	public void setCasado(boolean casado) {
		this.casado = casado;
	}
	public boolean isViudo() {
		return viudo;
	}
	public void setViudo(boolean viudo) {
		this.viudo = viudo;
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
