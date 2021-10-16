package Requerimiento2_LuciaLopez;

import java.util.LinkedList;
import java.util.Queue;

//Clase BufferEmails. Creada para depositar los emails que se producen. Tendr� una capaciodad de 5 emails como m�ximo 

public class BufferEmails {
	
	// Constante MAX_ELEMENTOS para indicar el l�mite de capacidad del buffer 
	public final static int MAX_ELEMENTOS = 4; 
	
	// Para incluir los elementos producidos, creamos una lista tipo Emails
	private Queue<Emails> buffer = new LinkedList<>();
	
	// Creamos m�todo sincronizado para a�adir emails al buffer 
	public synchronized void addEmail(Emails email) {
		// Indicamos con un while que si el buffer est� lleno, tendr� que esperar hasta que se saquen elementos. 
		while(buffer.size() == MAX_ELEMENTOS) {
			try {
				wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		//Para simular que los emails se ir�n poniendo en el buffer cada 0,5 segundos, creamos un Thread.sleep
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Requerimiento 3. Para evitar que se produzcan emails que se env�en a pikachu@gmail.com, creamos un if, 
		// igualando el destinatario con ese email y descartandolo 
		if(email.getDestinatario().equals("pikachu@gmail.com")) {
			buffer.remove(email);
			System.out.println("Se ha descartado el email enviado a: pikachu@gmail");
		//En el caso de que no sea ese email, a�adimos el email al buffer
		}else buffer.offer(email);
		// Con notify, notificamos a todos los hilos que est�n en estado wait, a que se despierten 
		notify();
	}
	
	// Creamos m�todo sincronizado para retirar emails del buffer 
	public synchronized Emails getEmail() {
		Emails e = null; 
		// Indicamos con un while que si el buffer est� vac�o, tendr� que esperar hasta que se introduzcan elementos. 
		while(buffer.size() == 0) {
			try {
				wait();
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		// Retiramos un elemento del buffer 
		e = buffer.poll();
		// Notificamos al resto de hilos que despierten para continuar
		notify();
		return e;
	}
	
}