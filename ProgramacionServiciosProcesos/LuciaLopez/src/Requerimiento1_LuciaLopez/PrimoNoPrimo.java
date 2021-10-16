package Requerimiento1_LuciaLopez;

public class PrimoNoPrimo implements Runnable{

	
	private long numeroSolicitado; 
	private double tiempo;	
	
	public PrimoNoPrimo(long numeroSolicitado) {
		
		this.numeroSolicitado = numeroSolicitado; 
		}
	
	public  void DeterminarPrimo() {
		boolean primo = true;
		long contador = 2;
		long inicio = System.currentTimeMillis();
	    
	    while ((primo) && (contador!=numeroSolicitado)){
	      if (numeroSolicitado % contador == 0)
	        primo = false;
	      contador++;
	    }

	    
	    long fin = System.currentTimeMillis(); 
		tiempo = (double) (fin - inicio)/1000;
	   
	    
		if(primo == true) {
			System.out.println( "El numero procesado es el " + numeroSolicitado + "  es primo. Nombre del hilo: " + Thread.currentThread().getName() + ". Ha tardado en ejecutarse: " + tiempo + " segundos");
		}else System.out.println( "El numero procesado es el " + numeroSolicitado + "  no es primo. Nombre del hilo: " + Thread.currentThread().getName() + ". Ha tardado en ejecutarse: " + tiempo + " segundos");
		
	}

	
	public long getNumeroSolicitado() {
		
		return numeroSolicitado;
	}

	public void setNumeroSolicitado(long numeroSolicitado) {
		this.numeroSolicitado = numeroSolicitado;
	}

	public double getTiempo() {
		return tiempo;
	}

	public void setTiempo(double tiempo) {
		this.tiempo = tiempo;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		DeterminarPrimo();
		
	}
	
}