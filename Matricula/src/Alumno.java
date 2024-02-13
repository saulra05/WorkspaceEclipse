
public class Alumno {
    private String id;
    private String nombre;
    private String apellidos;
    private String dni;
    private String correo;
    private String direccion;
    private String nre;
   
    public Alumno(String id, String nombre, String apellidos, String dni, String correo, String direccion, String nre) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.correo = correo;
		this.direccion = direccion;
		this.nre = nre;
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
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getNre() {
		return nre;
	}
	public void setNre(String nre) {
		this.nre = nre;
	}
	

    public void mostrar() {
        System.out.println("Id del alumno: " + getId());
        System.out.println("Nombre del alumno: " + getNombre());
        System.out.println("Apellidos del alumno: " + getApellidos());
        System.out.println("Dni del alumno: " + getDni());
        System.out.println("Correo del alumno: " + getCorreo());
        System.out.println("Dirección del alumno: " + getDireccion());
        System.out.println("Nre del alumno: " + getNre());
        System.out.println("");
    }
  
}
    
