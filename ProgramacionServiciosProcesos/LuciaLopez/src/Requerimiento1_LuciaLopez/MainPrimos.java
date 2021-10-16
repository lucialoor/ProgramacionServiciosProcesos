package Requerimiento1_LuciaLopez;

import java.util.Scanner;

public class MainPrimos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el número 1: ");
		long numero1  = sc.nextLong();
		System.out.println("Introducel el número 2: ");
		long numero2  = sc.nextLong();
		System.out.println("Introducel el número 3: ");
		long numero3  = sc.nextLong();
		System.out.println("Introducel el número 4: ");
		long numero4  = sc.nextLong();
		
		PrimoNoPrimo n1 = new PrimoNoPrimo(numero1);
		PrimoNoPrimo n2 = new PrimoNoPrimo(numero2);
		PrimoNoPrimo n3 = new PrimoNoPrimo(numero3);
		PrimoNoPrimo n4 = new PrimoNoPrimo(numero4);
		
		
		Thread t1 = new Thread(n1);
		Thread t2 = new Thread(n2);
		Thread t3 = new Thread(n3);
		Thread t4 = new Thread(n4);
		
		t1.setName("Hilo 1");
	
		t2.setName("Hilo 2");
	
		t3.setName("Hilo 3");

		t4.setName("Hilo 4");

		
		
		
		t1.start();
		
		t2.start();
		
		t3.start();
		
		t4.start();
		
	}

}
