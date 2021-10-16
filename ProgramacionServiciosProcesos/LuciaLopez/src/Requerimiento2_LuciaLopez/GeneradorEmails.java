package Requerimiento2_LuciaLopez;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class GeneradorEmails {
	// Cada hilo producirá 10 emails y cada uno de ellos tendrá un destinatario, un remitente, un asunto y un cuerpo de mensaje diferente
	// Por lo que los vamos a crear a través de los siguientes métodos, en los que se van a escoger aleatoriamente la información añadida 
	// en listas creadas
	
	public Emails generarEmails() {
		
		Emails email = new Emails();
		email.setDestinatario(generarDestinatario());
		email.setRemitente(generarRemitente());
		email.setAsunto(generarAsunto());
		email.setCuerpo(generarCuerpo());
		
		return email;
	}
	
	public String generarDestinatario() {
		
		List<String> listaDestinatarios = new ArrayList<String>();
		listaDestinatarios.add("gandalf@hotmail.com");
		listaDestinatarios.add("gollum@hotmail.com");
		listaDestinatarios.add("aragorn@hotmail.com");
		listaDestinatarios.add("legolas@hotmail.com");
		listaDestinatarios.add("frodo@hotmail.com");
		listaDestinatarios.add("sauron@hotmail.com");
		listaDestinatarios.add("arwen@hotmail.com");
		listaDestinatarios.add("bilbo@hotmail.com");
		listaDestinatarios.add("pikachu@gmail.com");
		listaDestinatarios.add("sam@hotmail.com");
		
		int numero = ThreadLocalRandom.current().nextInt(0,10);
		
		return listaDestinatarios.get(numero);
		
	}
	
	public String generarRemitente() {
		List<String> listaRemitentes = new ArrayList<String>();
		listaRemitentes.add("hermione@gmail.com");
		listaRemitentes.add("harry@gmail.com");
		listaRemitentes.add("voldemort@gmail.com");
		listaRemitentes.add("draco@gmail.com");
		listaRemitentes.add("dumbledore@gmail.com");
		listaRemitentes.add("snape@gmail.com");
		listaRemitentes.add("ron@gmail.com");
		listaRemitentes.add("dobby@gmail.com");
		listaRemitentes.add("hagrid@gmail.com");
		listaRemitentes.add("bellatrix@gmail.com");
		
		int numero = ThreadLocalRandom.current().nextInt(0,10);
		
		return listaRemitentes.get(numero);
	}
	
	public String generarAsunto() {
		List<String> listaAsuntos = new ArrayList<String>(); 
		listaAsuntos.add("Anillo unico");
		listaAsuntos.add("Gandalf el Gris");
		listaAsuntos.add("Un Viaje en la Oscuridad");
		listaAsuntos.add("La Disolución de la Comunidad");
		listaAsuntos.add("Muchos Encuentros");
		listaAsuntos.add("La cámara secreta"); 
		listaAsuntos.add("El misterio de Principe");
		listaAsuntos.add("El prisionero de Azkaban");
		listaAsuntos.add("Las Reliquias de la Muerte");
		listaAsuntos.add("La Piedra Filosofal");
		
		int numero = ThreadLocalRandom.current().nextInt(0,10);
		
		return listaAsuntos.get(numero);
		
	}
	
	public String generarCuerpo() {
		List<String> listaCuerpos = new ArrayList<String>();
		listaCuerpos.add("¿No reconoces a la muerte cuando la ves?");
		listaCuerpos.add("Me hace feliz que estés aquí conmigo. Aquí al final de todas las cosas.");
		listaCuerpos.add("Cuando las cosas están en peligro alguien tiene que renunciar a ellas, perderlas, para que otros las conserven.");
		listaCuerpos.add("¡Cazadlos! No paréis hasta encontrarlos. No conocéis el miedo. No conocéis el dolor. Os saciaréis de carne humana.");
		listaCuerpos.add("Pero al final, todo es pasajero. Como esta sombra, incluso la oscuridad se acaba, para dar paso a un nuevo día. Y cuando el sol brilla, brilla más radiante aún.");
		listaCuerpos.add("¿Cómo retomas el hilo de una vida vieja? ¿Cómo continúas, cuando en tu corazón empiezas a entender que no hay regreso posible?");
		listaCuerpos.add("Llegaré, aunque deje todo menos los huesos por camino. Y llevaré al señor Frodo a cuestas, aunque me rompa el lomo y el corazón.");
		listaCuerpos.add("Pero descansad, si tenéis que hacerlo. Mas no abandonéis toda esperanza.");
		listaCuerpos.add("Los atajos cortos traen retrasos largos, pero las posadas los alargan todavía más.");
		listaCuerpos.add("Quien no es capaz de desprenderse de un tesoro en un momento de necesidad es como un esclavo encadenado.");
		listaCuerpos.add("Desleal es aquel que se despide cuando el camino se oscurece.");
		listaCuerpos.add("Sólo tú puedes decidir qué hacer con el tiempo que se te ha dado.");
		listaCuerpos.add("Las ovejas terminan por parecerse a los pastores y los pastores a las ovejas.");
		listaCuerpos.add("Hasta la persona más pequeña puede cambiar el curso del futuro.");
		listaCuerpos.add("Cuando los grandes caen, los pequeños ocupan sus puestos.");
		listaCuerpos.add("No son nuestras habilidades las que muestran cómo somos, sino nuestras elecciones");
		listaCuerpos.add("Las palabras son, en mi no tan humilde opinión, nuestra más inagotable fuente de magia, capaces de infringir daño y de remediarlo");
		listaCuerpos.add("Si quieres saber en verdad como una persona es, échale una mirada a cómo trata a sus inferiores, no a sus iguales");
		listaCuerpos.add("Juro solemnemente que esto es una travesura");
		listaCuerpos.add("Me voy a la cama antes de que a alguno de los dos se os ocurra otra genial idea y acabemos muertos. O peor: expulsados");
		listaCuerpos.add("No todos los magos son buenos, algunos se malogran");
		listaCuerpos.add("Lo que perdemos al final siempre vuelve a nosotros... aunque a veces no del modo que esperamos");
		listaCuerpos.add("La curiosidad no es un pecado,  pero debemos ser cautos con ella");
		listaCuerpos.add("Todos tenemos luz y oscuridad en nuestro interior: lo que importa es qué parte decidimos potenciar");
		listaCuerpos.add("Lo que importa no son vuestras similitudes, sino vuestras diferencias");
		listaCuerpos.add("Nunca se irá del todo, no mientras haya quien le guarde lealtad");
		listaCuerpos.add("Es leviósa. No leviosá");
		listaCuerpos.add("No sirve de nada preocuparse. Lo que venga vendrá, y le plantaremos cara");
		listaCuerpos.add("La grandeza inspira envidia, la envidia engendra rencor y el rencor genera mentiras");
		listaCuerpos.add("La felicidad puede hallarse hasta en los más oscuros momentos, si somos capaces de usar bien la luz");
		
		int numero = ThreadLocalRandom.current().nextInt(0,10);
		
		return listaCuerpos.get(numero);
		
	}
}