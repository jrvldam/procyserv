package ejercicio2_2;

import java.io.*;
//import java.util.Scanner;

public class MainHilos {
	public static void main(String[] arg) throws IOException{
		int control = 1;
		long numero = 0;
	
		//((Hilo1) h1).setNumero(4568457);
		//((Hilo2)h2).setNumero(6);	
		
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
	
		try{
			while (control > 0){
				
				Thread h1 = new Hilo1(" HiloPrimo ");
				Thread h2 = new Hilo2( "HiloDivisores ");
				
				//Scanner in = new Scanner(System.in);
				
				System.out.println("");
				System.out.print("Ingrese un numero entero: ");
				String lectura = teclado.readLine ();
				numero = Long.parseLong (lectura);
				//numero = in.nextLong();
				
				if(numero > 0){
					((Hilo1)h1).setNumero(numero);
					((Hilo2)h2).setNumero(numero);
					h1.start();
					h2.start();
					
					while (h1.isAlive() ||h2.isAlive()) Thread.yield();
					
				}else{
					control = 0;
				}
			}
			System.out.println("Adios.");
		}catch(IllegalThreadStateException e){
			System.out.println("consulte: "+e);
		}
	}
}
