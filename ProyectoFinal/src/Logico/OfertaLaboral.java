package Logico;

public class OfertaLaboral {

	private String id, tipo, nombre, carrera, area, nacionalidad, oficio1, oficio2, oficio3, oficio4, sexo, estadoCivil;
	private int cantAspirantes, yearsExperiencia, edad;
	private boolean completado, espanol, ingles, frances, dispuestoMudarse, licenciaConducir, trabajoParcial, microsoftOffice, adobe;
	private float paga;
	public static int codOfertaLaboral = 1;
	
	public OfertaLaboral(String id, String tipo, String nombre, String carrera, String area, String nacionalidad,
			String oficio1, String oficio2, String oficio3, String oficio4, String sexo, String estadoCivil,
			int cantAspirantes, int yearsExperiencia, int edad, boolean completado, boolean espanol, boolean ingles,
			boolean frances, boolean dispuestoMudarse, boolean licenciaConducir, boolean trabajoParcial,
			boolean microsoftOffice, boolean adobe, float paga) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.nombre = nombre;
		this.carrera = carrera;
		this.area = area;
		this.nacionalidad = nacionalidad;
		this.oficio1 = oficio1;
		this.oficio2 = oficio2;
		this.oficio3 = oficio3;
		this.oficio4 = oficio4;
		this.sexo = sexo;
		this.estadoCivil = estadoCivil;
		this.cantAspirantes = cantAspirantes;
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
		OfertaLaboral.codOfertaLaboral++;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
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
	public static int getCodOfertaLaboral() {
		return codOfertaLaboral;
	}
	public static void setCodOfertaLaboral(int codOfertaLaboral) {
		OfertaLaboral.codOfertaLaboral = codOfertaLaboral;
	}
}
