package Requerimiento2_LuciaLopez;

public class ProductorEmails extends Thread{
	
	// Propiedades productor: Nombre y buffer, por el que tiene que pasar para guardar emails.
	public String nombre;
	public BufferEmails buffer;
	
	//CONSTRUCTOR
	public ProductorEmails(String nombre, BufferEmails buffer) {
		super();
		this.nombre = nombre;
		this.buffer = buffer; 
	}
	
	public void run() {
		// Creamos un objeto GeneradorEmails para llamar a su metodo generarEmails, que al ser tipo Emails, nos devuelve el dato id
		GeneradorEmails ge = new GeneradorEmails(); 
		
		// Creamos bucle for con 10 iteraciones para que cada hilo produzca diez emails  
		for(int i =1; i<=10; i++) {
			
			Emails email = ge.generarEmails();
			
			// Añadimos email al buffer
			buffer.addEmail(email);
			
			//Imprimimos por pantalla cada vez que meta un email en el buffer su nombre y el id del email metido
			System.out.println(nombre + " ha producido un email con id: " + email.getId());
			}
	}
}