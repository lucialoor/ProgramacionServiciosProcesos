package Requerimiento2_LuciaLopez;

public class Emails {
	// Los emails tendrán un id, un destinatario, un remitente, un asunto y un cuerpo del mensaje.
	private int id; 
	private static int id_unico = 1; 
	private String destinatario; 
	private String remitente; 
	private String asunto; 
	private String cuerpo;
	// Creamos setters y getters de cada propiedad. 
	
	// Para que cada hilo tenga emails con id único, creamos una variable estática que irá aumentando un número cada vez que se genere un nuevo email.
	public int getId() {
		id = id_unico;
		id_unico++;
		return id;
	}
	
	public void setId(int id) {
		this.id = id; 
	}
	
	public String getDestinatario() {
		return destinatario;
	}
	
	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}
	
	public String getRemitente() {
		return remitente;
	}
	
	public void setRemitente(String remitente) {
		this.remitente = remitente;
	}
	
	public String getAsunto() {
		return asunto;
	}
	
	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}
	
	public String getCuerpo() {
		return cuerpo;
	}
	
	public void setCuerpo(String cuerpo) {
		this.cuerpo = cuerpo;
	}
	// Creamos método toString para devolver los datos de cada email producido.
	@Override
	public String toString() {
		return "Destinatario: " + destinatario + "\n" + "Remitente: " + remitente + "\n" + "Asunto:" + asunto + "\n"
				+ "Cuerpo: " + cuerpo;
	}


	
}
