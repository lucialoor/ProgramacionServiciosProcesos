package Requerimiento2_LuciaLopez;

public class ConsumidorEmails extends Thread{
	
	/*Habrá 2 hilos que consuman los emails del buffer siempre que haya email disponible. 
	  Cada vez que un consumidor coja un email, simulará su envio simplemente imprimiendo 
	  por pantalla los datos del email, así como el nombre del hilo consumidor que ha cogido dicho email.*/
	
	// Propiedades consumidor: Nombre y buffer, por el que tiene que pasar para coger emails.
	private String nombre; 
	private BufferEmails buffer; 
	
	// CONSTRUCTOR
	public ConsumidorEmails(String nombre, BufferEmails buffer){
		this.nombre = nombre;
		this.buffer = buffer; 
		
	}
	
	public void run() {
	
		// Los consumidores cogerán emails siempre que haya disponibles en el buffer, por lo que creamos bucle while. 
		while(true) {
			// Cogemos email del buffer con buffer.getEmail();
			// Creamos un email tipo Emails, y guardamos el email retirado. 
			Emails email = buffer.getEmail();
			
			// Imprimimos por pantalla todos los datos del email, y el nombre del hilo que ha cogido el email
			System.out.println(nombre + " ha consumido el siguiente mensaje: " + "\n" + email + "\n" + "El nombre del hilo consumidor es: " + Thread.currentThread().getName());
			
		}
	}
}