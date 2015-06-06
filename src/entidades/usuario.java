package entidades;

public class usuario {
	//Variables globales del usuario
	private int codUser;
	private String nameUser;
	private String lastnameUser;
	private int codDocUser;
	private int dniUser;
	private int area;
	private String email;
	private String fono;
	private String fechaIngreso;
	private String password;
	private int status;
	
	public int getCodUser() {
		return codUser;
	}

	public void setCodUser(int codUser) {
		this.codUser = codUser;
	}

	public String getNameUser() {
		return nameUser;
	}

	public void setNameUser(String nameUser) {
		this.nameUser = nameUser;
	}

	public String getLastnameUser() {
		return lastnameUser;
	}

	public void setLastnameUser(String lastnameUser) {
		this.lastnameUser = lastnameUser;
	}

	public int getCodDocUser() {
		return codDocUser;
	}

	public void setCodDocUser(int codDocUser) {
		this.codDocUser = codDocUser;
	}

	public int getDniUser() {
		return dniUser;
	}

	public void setDniUser(int dniUser) {
		this.dniUser = dniUser;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFono() {
		return fono;
	}

	public void setFono(String fono) {
		this.fono = fono;
	}

	public String getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
	public String getPass() {
		return nameUser;
	}

	public void setPass(String password) {
		this.password = password;
	}
//Constructor de usuario
	public usuario(int codUser, String nameUser, String lastnameUser, int codDocUser,
					int dniUser, int area, String email, String fono,
					String fechaIngreso, int status, String password) {
		
		this.codUser = codUser;
		this.nameUser = nameUser;
		this.lastnameUser = lastnameUser;
		this.codDocUser = codDocUser;
		this.dniUser = dniUser;
		this.area = area;
		this.email = email;
		this.fono = fono;
		this.fechaIngreso = fechaIngreso;
		this.status = status;
		this.password = password;
	}
	
}
