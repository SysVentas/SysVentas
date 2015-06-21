package modelo;

public class UsuarioVO {
	
	public String  rutE;
	public String  nombreE;
	public String  apellidoE;
	public String  correo;
	public String  numeroTelefono;
	
	// setters
	public void setRut(String rutE){
		this.rutE = rutE;
	}
	
	public void setNombre(String nombreE){
		this.nombreE = nombreE;
	}
	
	public void setApellido(String apellidoE){
		this.apellidoE = apellidoE;
	}
	
	public void setCorreo(String correo){
		this.correo = correo;
	}
	
	public void setNumeroTelefono(String numeroTelefono){
		this.numeroTelefono = numeroTelefono;
	}
	// getters
	
	public String getRut(){
		return rutE;
	}
	
	public String getNombre(){
		return nombreE;
	}
	
	public String getApellido(){
		return apellidoE;
	}
	
	public String getCorreo(){
		return correo;
	}
	
	public String getNumero(){
		return numeroTelefono;
	}
}