
public class Modulo {
	private String id;
	private String nombreMod;
	private String curso;
	private String horas;
	private String profesor;
	private Alumno [] alumno;
	
	
	public Modulo(String id, String nombreMod, String curso, String horas, String profesor) {
		super();
		this.id = id;
		this.nombreMod = nombreMod;
		this.curso = curso;
		this.horas = horas;
		this.profesor = profesor;
	
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombreMod() {
		return nombreMod;
	}
	public void setNombreMod(String nombreMod) {
		this.nombreMod = nombreMod;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String getHoras() {
		return horas;
	}
	public void setHoras(String horas) {
		this.horas = horas;
	}
	public String getProfesor() {
		return profesor;
	}
	public void setProfesor(String profesor) {
		this.profesor = profesor;
	}
	
	public void mostrar() {
        System.out.println("Id del alumno: " + getId());
        System.out.println("Nombre del alumno: " + getNombreMod());
        System.out.println("Apellidos del alumno: " + getCurso());
        System.out.println("Dni del alumno: " + getHoras());
        System.out.println("Correo del alumno: " + getProfesor());
        System.out.println("");
    }
}
